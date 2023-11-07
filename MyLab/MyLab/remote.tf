terraform {
    cloud {
        organization = "devopspractice21"
        workspaces {
          name = "TerraformLab"
        }
    }
}