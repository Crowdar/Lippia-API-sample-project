# System Requirements:
+ JDK: https://docs.oracle.com/en/java/javase/index.html 
+ Maven: https://maven.apache.org/download.cgi 
+ Git client: https://www.atlassian.com/git/tutorials/install-git 

# Getting started

## Running with Maven

  + ### First Step

    + Download and unzip the source repository for this guide, or clone it using Git:   
    ```
    $ git clone https://gitlab.com/lippia/products/samples/lippia-api-sample-project.git
    ```

    + Go to root directory:   
    ```
    $ cd lippia-api-sample-project
    ```   

  + ### Second Step

    If you want to run tests locally, you need maven as a minimum requirement   
    + Make sure you have installed maven correctly   

    ```
    $ mvn --version

      OUTPUT:
        Apache Maven 3.8.2 (ea98e05a04480131370aa0c110b8c54cf726c06f)
        Maven home: /opt/apache-maven-3.8.2
        Java version: 13.0.5.1, vendor: Debian, runtime: /usr/lib/jvm/java-13-openjdk-amd64
        Default locale: en_US, platform encoding: UTF-8
        OS name: "linux", version: "5.10.0-6parrot1-amd64", arch: "amd64", family: "unix"
    ```

    If you don't see a similar output:
    + Make sure you have the maven path configured   
    #### Linux user
    ```
    $ grep -Ew '(.*)(M2_HOME)' ~/.bashrc

      OUTPUT:
        M2_HOME=/opt/apache-maven-3.8.2
        PATH=$PATH:$M2_HOME/bin
    ```   
    #### Windows user
    ```
    $ set

      OUTPUT:
        M2_HOME=C:\Program Files\apache-maven-3.8.2
        PATH=%PATH%;%M2_HOME%\bin;
    ```

  + ### Third Step

    + To run the tests with maven, we must execute the following command:   

    ```
    $ mvn clean test -PSecuencial
    ```
