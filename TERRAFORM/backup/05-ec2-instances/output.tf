output "aws_security_group_http_server_details" {
  value = aws_security_group.http_server_sg
}

output "ec2-instance-details" {
  value = aws_instance.http_server

}

output "ec2-instance-public-dns" {
  value = aws_instance.http_server.public_dns

}