variable "iam_user_name_prefix" {
  type = string
  default = "my_iam_user"
  
}

variable "names" {
  #type = list
  default = ["Sesharao","Sameer","Swarupa","Ramu","Geetha"]
}

variable "environment" {
  type = string
  #default = "dev"
  
}