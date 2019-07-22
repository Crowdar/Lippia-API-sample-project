#LIPPIA API Example Project

#Purpose: 

The following project has the purpose of demonstrate and let test automation developers to to test API requests using Lippia Automation Framework based on Rest Client library.


#Requirements :
- git client 
	https://www.atlassian.com/git/tutorials/install-git

- JDK 8 
	https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 
	https://openjdk.java.net/install/

+ maven 3 
	https://maven.apache.org/download.cgi

Linux
Running selenium grid container
linux
docker 18.09 
https://docs.docker.com/install/linux/docker-ce/ubuntu/
docker compose 1.24 
https://docs.docker.com/compose/install/
go to root folder project you will find a docker-compose.yml file
run command : sudo docker-compose up --scale chrome=10 -d

#Executing tests
- Steps
   - Clone the project
   - Inside of project's folder run "mvn clean install"