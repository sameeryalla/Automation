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


variable "environment" {
  default = "default"
}



resource "aws_iam_user" "my_iam_user" {
    count = 1
    name = "my_iam_user_${environment}-${count.index}"  
}

