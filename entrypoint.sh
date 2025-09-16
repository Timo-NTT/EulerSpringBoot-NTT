#!/bin/sh

echo "### Printing ENV variables ###"
printenv | sort

echo "### Starting EVP Backend ###"
java -agentlib:jdwp=transport=dt_socket,address=*:8002,server=y,suspend=n -jar /opt/evp-backend-LOCAL-BUILD.jar