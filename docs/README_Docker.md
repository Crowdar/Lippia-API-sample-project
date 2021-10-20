## System Requirements:
+ JDK: https://docs.oracle.com/en/java/javase/index.html 
+ Maven: https://maven.apache.org/download.cgi 
+ Git client: https://www.atlassian.com/git/tutorials/install-git 
+ Docker 18.09+: https://docs.docker.com/install/linux/docker-ce/ubuntu/
+ Docker compose 1.24+: https://docs.docker.com/compose/install/

# Getting started

## Running with Docker

The following execution includes the basic Docker Lippia Containers to run this API sample project.   
You can choose the code from your favourite IDE, to run from console or from Jenkins by using the Docker Stack.

Note that if you don't have installed docker & docker-compose, [Click here](#system-requirements)

+ ### First Step
  - Make sure you have installed docker-engine correctly   
    ```
    $ docker --version
    OUTPUT:
    Docker version 19.03.15, build 99e3ed8919
    ```   
    
+ ### Second Step
  - Make sure you have installed docker-compose correctly
    ```
    $ docker-compose --version
      OUTPUT:
    docker-compose version 1.29.2, build 5becea4c
    ```   

+ ### Third Step   
        
  - Go to root project folder and you will find a pom.xml file   
    ```
    $ cd lippia-api-sample-project
    ```   
        
  - Run the following command:   
    ```
    $ sudo docker-compose -f docker-compose.yml up --abort-on-container-exit --exit-code-from lippia
      OUTPUT:
      Creating network "lippia-api-sample-project_default" with the default driver
      Creating lippia-api-sample-project_lippia_1 ... done
      Attaching to lippia-api-sample-project_lippia_1
      lippia_1  | Running custom Command mvn clean test -PSecuencial -Dcucumber.tags=@Success
      ...
    ```   
