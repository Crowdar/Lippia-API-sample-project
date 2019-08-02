#LIPPIA API Example Project

#Purpose: 

The following project has the purpose of demonstrate and let test automation developers to to test API requests using Lippia Automation Framework based on Rest Client library.

![Lippia Architecture API](https://bitbucket.org/crowdarautomation/lippia-api-example-project/raw/a4fc4af87f4a788ec80296d73048d9b842314864/architectureApi.png)

#Scenario Example

![Lippia Scenarios Example API](https://bitbucket.org/crowdarautomation/lippia-api-example-project/raw/5f432ebe2b056991993ade77cc5898ab541b7a5e/steps_example.png)


The scenarios can be written using BDD methodology. 
	
	Given as a precondition
	
	When as actions
	
	Then as validations
	
	
On each declared step you can insert the calls defined from service classes

#Json Structure for request data

This project use json to manage request data like url parameters, body data, headers and url endpoints. The following picture shows the structure of the json


![Lippia Scenarios Example API](https://bitbucket.org/crowdarautomation/lippia-api-example-project/raw/47a9fd7f14d3eff7472974e1f34356f8556498aa/images/jsonStructure.png)

#Extent Report

This project like all lippia products uses Extent reports that shows the status of each test run. This report also describe stadistic data for the total number of tests and the status of those


![Lippia Scenarios Example API](https://bitbucket.org/crowdarautomation/lippia-api-example-project/raw/47a9fd7f14d3eff7472974e1f34356f8556498aa/images/reporteExtent.png)


#Requirements :
- git client 
	https://www.atlassian.com/git/tutorials/install-git

- JDK 8 
	https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 
	https://openjdk.java.net/install/

+ maven 3 
	https://maven.apache.org/download.cgi

#Executing tests

 Steps 
 
   - Clone the project   
   
   - Inside of project's folder run "mvn clean install"