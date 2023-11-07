output "aws_security_group_http_server_details" {
  value = aws_security_group.elb_sg
}

output "ec2-instance-details" {
  value = aws_instance.http_servers

}

output "ec2-instance-public-dns" {
  #value = aws_instance.http_servers.*.public_dns
  value = values(aws_instance.http_servers).*.id
}
output "elb_public_dns" {
  value = aws_elb.elb
}