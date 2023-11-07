variable "iam_user_name_prefix" {
  type    = string
  default = "my_iam_user"

}

variable "users" {
  #type = list
  #default = ["Sesharao","Sameer","Swarupa","Ramu","Geetha"]
  default = {
    ravis : "Netherland",
    tom : "US",
    jane : "India"

  }
}

variable "users2" {
  default = {
    ravis : { country : "Netherland", department : "ABC" },
    tom : { country : "US", department : "DEF" },
    jane : { country : "India", department : "GHI" },

  }
}

variable "environment" {
  type = string
  #default = "dev"

}