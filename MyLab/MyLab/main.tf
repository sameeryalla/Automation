terraform {
    required_providers {
      aws = {
        source = "hashicorp/aws"
        version = "~>3.0"
      }
    }
}

#configure AWS provider
provider "aws" {
    region = "us-east-1"
    # access_key = "AKIATSOYEHGARIOWHPUX"
    # secret_key = "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"
}

#create a VPC
resource "aws_vpc" "MyLab-VPC"{
    cidr_block = var.cidr_block[0]

    tags = {
        Name = "MyLab-VPC"
    }
}

# create a subnet
resource "aws_subnet" "MyLab-subnet1" {
    vpc_id = aws_vpc.MyLab-VPC.id
    cidr_block = var.cidr_block[1]

    tags ={
      Name = "MyLab-subnet1"
    }
} 

#Create Internet Gateway
resource "aws_internet_gateway" "MyLab-IntGW" {
    vpc_id=aws_vpc.MyLab-VPC.id
    tags = {
      Name = "MyLab-IntGW"
    }  
}

#create Security Group
resource "aws_security_group" "MyLab-Sec-Grp" {
    name = "MyLab-Sec-Grp"
    description = "to allow inbound and outbound"
    vpc_id = aws_vpc.MyLab-VPC.id
    # ingress {
    #     from_port = 22
    #     to_port = 22
    #     protocol = "tcp"
    #     cidr_blocks = ["0.0.0.0/0"]
    # }
    dynamic ingress {
        iterator = port
        for_each = var.port
        content{
            from_port = port.value
            to_port = port.value
            protocol = "tcp"
            cidr_blocks = ["0.0.0.0/0"]
        }  
        
    }
    egress {
        from_port = 0
        to_port = 0
        protocol = "-1"
        cidr_blocks = ["0.0.0.0/0"]
    }
    tags ={
      Name = "Allow Traffic"
    } 
}

#create route table
resource "aws_route_table" "MyLab-RouteTable" {
    vpc_id = aws_vpc.MyLab-VPC.id
    route {
        cidr_block = "0.0.0.0/0"
        gateway_id = aws_internet_gateway.MyLab-IntGW.id
    }

    tags = {
        Name = "MyLab-Routetable"
    }
}

#Create route table association with subnet
resource "aws_route_table_association" "MyLab-Association" {
    subnet_id = aws_subnet.MyLab-subnet1.id
    route_table_id = aws_route_table.MyLab-RouteTable.id  
}

#Create EC2 instance for Jenkins
resource "aws_instance" "Jenkins" {
  ami           = var.ubuntu_ami
  instance_type = var.instance_type
  key_name = "docker"
  vpc_security_group_ids = [aws_security_group.MyLab-Sec-Grp.id]
  subnet_id = aws_subnet.MyLab-subnet1.id
  #associate_public_ip_address = true

  user_data = file ("./InstallJenkins.sh")

  tags = {
    Name = "jenkins-Server"
  }
}

#Create EC2 instance for Ansible
resource "aws_instance" "AnsibleController" {
  ami           = var.linux2_ami
  instance_type = var.instance_type
  key_name = "docker"
  vpc_security_group_ids = [aws_security_group.MyLab-Sec-Grp.id]
  subnet_id = aws_subnet.MyLab-subnet1.id
  ##associate_public_ip_address = true

  user_data = file ("./InstallAnsibleCN.sh")

  tags = {
    Name = "Ansible-ControlNodeN"
  }
}

#Create EC2 instance for Ansible managed node1 to host Apache Tomcat server
resource "aws_instance" "AnsibleManagedNode1" {
  ami           = var.linux2_ami
  instance_type = var.instance_type
  key_name = "docker"
  vpc_security_group_ids = [aws_security_group.MyLab-Sec-Grp.id]
  subnet_id = aws_subnet.MyLab-subnet1.id
  ##associate_public_ip_address = true

  user_data = file ("./AnsibleManagedNode.sh")

  tags = {
    Name = "AnsibleMN-ApacheTomcat"
  }
}

#Create EC2 instance for Ansible managed node1 to host Docker
resource "aws_instance" "DockerHost" {
  ami           = var.linux2_ami
  instance_type = var.instance_type
  key_name = "docker"
  vpc_security_group_ids = [aws_security_group.MyLab-Sec-Grp.id]
  subnet_id = aws_subnet.MyLab-subnet1.id
  #associate_public_ip_address = true

  user_data = file ("./Docker.sh")

  tags = {
    Name = "AnsibleMN-DockerHost"
  }
}

#Create EC2 instance for Sonatype Nexus to Nexus server
resource "aws_instance" "Nexus" {
  ami           = var.linux2_ami
  instance_type = var.instance_type_for_nexus
  key_name = "docker"
  vpc_security_group_ids = [aws_security_group.MyLab-Sec-Grp.id]
  subnet_id = aws_subnet.MyLab-subnet1.id
  #associate_public_ip_address = true

  user_data = file ("./InstallNexus.sh")

  tags = {
    Name = "Nexus-Server"
  }
}

#Create EC2 instance for Sonarqube
resource "aws_instance" "Sonarqube" {
  ami           = var.linux2_ami
  instance_type = var.instance_type_for_nexus
  key_name = "docker"
  vpc_security_group_ids = [aws_security_group.MyLab-Sec-Grp.id]
  subnet_id = aws_subnet.MyLab-subnet1.id
  #associate_public_ip_address = true

  user_data = file ("./InstallSonarqube.sh")

  tags = {
    Name = "Sonarqube-Server"
  }
}