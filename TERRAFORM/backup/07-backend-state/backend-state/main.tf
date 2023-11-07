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

//S3 bucket
resource "aws_s3_bucket" "enterprise_backend_state" {
    bucket = "dev-applications-backend-state-in28minutes-abc"

    lifecycle {
        prevent_destroy = true
    }

#    versioning {
#        enabled = true
#    }
#
#    server_side_encryption_configuration {
#        rule {
#            apply_server_side_encryption_by_default {
#                sse_algorithm = "AES256"
#            }
#        }
#    }

}

//Locking - Dynamo DB

resource "aws_dynamodb_table" "enterprise_backend_lock" {
    name = "dev_application_locks"
    billing_mode = "PAY_PER_REQUEST"

    hash_key = "LockID"
    
    attribute {
        name = "LockID"
        type = "S"
    }

}
