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
resource "aws_s3_bucket" "my_s3_bucket" {
    bucket = "my-s3-bucket-in28minutes-sam-2127" 
    #versioning {
    #  enabled = true
    #}
}
resource "aws_s3_bucket_versioning" "versioning_example" {
    bucket  = aws_s3_bucket.my_s3_bucket.id
    versioning_configuration {
      status = "Enabled"
    }
}
resource "aws_iam_user" "my_iam_user" {
    count = 3
    name = "my_iam_user_${count.index}"  
}

