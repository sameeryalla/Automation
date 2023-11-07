#! /bin/bash

# Install Java
amazon-linux-extras install java-openjdk11 -y
dnf install java-11-amazon-corretto -y

# Download and Install Jenkins
yum update -y
wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo
rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io-2023.key
sudo yum install jenkins -y

# start Jenkins service
systemctl start jenkins

# install Git SCM
yum install git -y

# Enable jenkins service
systemctl enable jenkins
chkconfig jenkins on  