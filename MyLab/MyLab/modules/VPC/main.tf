#create a VPC
resource "aws_vpc" "MyLab-VPC"{
    cidr_block = var.cidr_block_from_variablesfile

    tags = {
        Name = "MyLab-VPC"
    }
}