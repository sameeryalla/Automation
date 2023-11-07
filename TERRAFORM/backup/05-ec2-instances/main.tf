provider "aws" {
  region = "us-east-1"
  #access_key = "AKIATSOYEHGA55PKFU3V"
  #secret_key = "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"
}

terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 5.0"
    }
  }
}

resource "aws_default_vpc" "default" {

}

//http server -->sg
//SG-->80 TCP, 22 TCP, CIDR []
resource "aws_security_group" "http_server_sg" {
  name = "http_server_sg"
  #vpc_id = "vpc-03c2e4a8a5bf734ba"
  vpc_id = aws_default_vpc.default.id
  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
  ingress {
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
  egress {
    from_port   = 0
    to_port     = 0
    protocol    = -1
    cidr_blocks = ["0.0.0.0/0"]
  }
  tags = {
    name = "http_server_sg"
  }

}

resource "aws_instance" "http_server" {

  ami = "ami-041feb57c611358bd"
  #ami                    = data.aws_ami_ids.aws-linux-2-latest-ids
  key_name               = "default-ec2"
  instance_type          = "t2.micro"
  vpc_security_group_ids = [aws_security_group.http_server_sg.id]
  #subnet_id              = "subnet-01711aca8679ffc60"
  #subnet_id              = tolist(data.aws_subnet_ids.default-subnets.ids)[0]
  subnet_id = data.aws_subnets.default-subnets.ids[0]
  tags = {
    Name = "eC2-Instance-In28min"
    name = "eC2-Instance-In28min"
  }
  connection {
    type        = "ssh"
    host        = self.public_ip
    user        = "ec2-user"
    private_key = file(var.aws-key-pair)
  }
  provisioner "remote-exec" {
    inline = [
      // Install httpd
      "sudo yum install httpd -y",
      //start httpd
      "sudo service httpd start",
      //copy a file
      "echo Welcome to In28Minutes - Virtual Server is at ${self.public_dns} | sudo tee /var/www/html/index.html"
    ]
  }

}