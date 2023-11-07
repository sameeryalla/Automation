variable "cidr_block" {
    type = list(string)
    
}

variable "port" {
    type = list(number)
} 

variable "ubuntu_ami" {
    type = string
    default = "ami-06ca3ca175f37dd66"
}

variable "linux2_ami" {
    type = string
    default = "ami-0f9ce67dcf718d332"
}

variable "instance_type" {
    type = string
    default = "t2.micro"
}

variable "instance_type_for_nexus" {
    type = string
    default = "t2.medium"
}