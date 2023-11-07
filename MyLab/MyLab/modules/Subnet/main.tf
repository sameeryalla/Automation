# create a subnet
resource "aws_subnet" "MyLab-subnet1" {
    vpc_id = var.vpc_id_from_vpcmodule
    cidr_block = var.cidr_subnet_from_variablesfile

    tags ={
      Name = "MyLab-subnet1"
    }
}  