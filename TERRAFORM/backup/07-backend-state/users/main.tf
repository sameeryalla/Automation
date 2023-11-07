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

resource "aws_iam_user" "my_iam_user" {
  name = "my_iam_user_abc"
}
