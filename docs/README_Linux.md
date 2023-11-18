## Lippia Web sample project - Linux users

## System Requirements :
+ Docker 18.09: https://docs.docker.com/install/linux/docker-ce/ubuntu/
+ Docker compose 1.24: https://docs.docker.com/compose/install/

# Getting started

[Download]: <https://bitbucket.org/crowdarautomation/lippia-api-sample-project/get/5db6458fef4a.zip>
 
- [Download] and unzip the source repository for this guide, or clone it using Git:
    ``` $ git clone https://bitbucket.org/crowdarautomation/lippia-api-sample-project.git ```
- Go to root directory  
    ``` $ cd lippia-api-sample-project ```
## Strategies to run
***

- [Local] (#local) (running tests building project with maven from command line)


#### Local strategy
##### Executing tests in you local machine from command line
- From terminal  execute  
   
```
$ sudo docker-compose -f docker-compose.yml up --abort-on-container-exit --exit-code-from lippia

Starting lippia-api-sample-project_lippia_1 ... done
Attaching to lippia-api-sample-project_lippia_1
lippia_1  | Running custom Command mvn clean test -PParalelo -Dcucumber.tags=@Success
lippia_1  | [INFO] Scanning for projects...
lippia_1  | [INFO] 
lippia_1  | [INFO] ---------------< com.Crowdar:lippia-api-example-project >---------------
lippia_1  | [INFO] Building api-rest-automation 3.2.1.1
lippia_1  | [INFO] --------------------------------[ jar ]---------------------------------
lippia_1  | Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/maven-metadata.xml
lippia_1  | Downloading from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/grpc/grpc-core/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/maven-metadata.xml (2.7 kB at 1.9 kB/s)
lippia_1  | Downloaded from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/grpc/grpc-core/maven-metadata.xml (2.7 kB at 1.8 kB/s)
lippia_1  | Downloading from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/netty/netty-codec-http2/maven-metadata.xml
lippia_1  | Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/maven-metadata.xml (2.8 kB at 7.9 kB/s)
lippia_1  | Downloaded from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/netty/netty-codec-http2/maven-metadata.xml (2.8 kB at 6.5 kB/s)
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ lippia-api-example-project ---
lippia_1  | [INFO] Deleting /opt/workspace/automation/target
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-resources-plugin:2.4:resources (default-resources) @ lippia-api-example-project ---
lippia_1  | [INFO] Using 'UTF-8' encoding to copy filtered resources.
lippia_1  | [INFO] Copying 3 resources
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ lippia-api-example-project ---
lippia_1  | [INFO] Changes detected - recompiling the module!
lippia_1  | [INFO] Compiling 8 source files to /opt/workspace/automation/target/classes
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-resources-plugin:2.4:testResources (default-testResources) @ lippia-api-example-project ---
lippia_1  | [INFO] Using 'UTF-8' encoding to copy filtered resources.
lippia_1  | [INFO] Copying 6 resources
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ lippia-api-example-project ---
lippia_1  | [INFO] Changes detected - recompiling the module!
lippia_1  | [INFO] Compiling 5 source files to /opt/workspace/automation/target/test-classes
lippia_1  | [INFO] /opt/workspace/automation/src/test/java/ar/steps/UserSteps.java: Some input files use or override a deprecated API.
lippia_1  | [INFO] /opt/workspace/automation/src/test/java/ar/steps/UserSteps.java: Recompile with -Xlint:deprecation for details.
lippia_1  | [INFO] /opt/workspace/automation/src/test/java/ar/steps/UserSteps.java: /opt/workspace/automation/src/test/java/ar/steps/UserSteps.java uses unchecked or unsafe operations.
lippia_1  | [INFO] /opt/workspace/automation/src/test/java/ar/steps/UserSteps.java: Recompile with -Xlint:unchecked for details.
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-surefire-plugin:3.0.0-M4:test (default-test) @ lippia-api-example-project ---
lippia_1  | [INFO] 
lippia_1  | [INFO] -------------------------------------------------------
lippia_1  | [INFO]  T E S T S
lippia_1  | [INFO] -------------------------------------------------------
lippia_1  | [INFO] Running TestSuite
lippia_1  | 08/09/20 17:11:36 INFO  BasicHook:20 - ------ Starting -----Example scenario for get user data-----
lippia_1  | 08/09/20 17:11:36 INFO  BasicHook:20 - ------ Starting -----Example scenario for get user data-----
lippia_1  | 08/09/20 17:11:36 INFO  BasicHook:20 - ------ Starting -----Example scenario for get user data-----
lippia_1  | 08/09/20 17:11:36 INFO  BasicHook:20 - ------ Starting -----Example scenario for get user data-----
lippia_1  | 08/09/20 17:11:36 INFO  BasicHook:20 - ------ Starting -----Example scenario for input parameters-----
lippia_1  | 08/09/20 17:11:37 INFO  MethodsService:109 - >>>Request: https://postman-echo.com/response-headers, {foo1=bar1, foo2=bar2}
lippia_1  | 08/09/20 17:11:37 INFO  MethodsService:109 - >>>Request: https://reqres.in/api/users, {id=2}, {Content-Type=application/json}
lippia_1  | 08/09/20 17:11:37 INFO  MethodsService:109 - >>>Request: https://reqres.in/api/users, {Content-Type=application/json}, {"name":"test","job":"leader"}
lippia_1  | 08/09/20 17:11:37 INFO  MethodsService:109 - >>>Request: https://reqres.in/api/users, {Content-Type=application/json}, {"name":"test","job":"leader"}
lippia_1  | 08/09/20 17:11:37 INFO  MethodsService:109 - >>>Request: https://reqres.in/api/users, {Content-Type=application/json}, {"name":"test","job":"leader"}
lippia_1  | 08/09/20 17:11:39 INFO  RestClient:90 - >>>Response: <200 OK,api.model.ResponseHeaders@4f611174,{Date=[Tue, 08 Sep 2020 17:11:39 GMT], Content-Type=[application/json; charset=utf-8], Content-Length=[29], Connection=[keep-alive], foo1=[bar1], foo2=[bar2], ETag=[W/"1d-PgOLWVqd2mMvcpNzTF0Cfy4hftg"], Vary=[Accept-Encoding], set-cookie=[sails.sid=s%3APz8ETqhRBfW8n95KfKTvRTrHDtHUpWYT.o2k%2BOMOhj%2FrpM2gobjrOQA7jPdofkC2qQdiW%2BywILZ0; Path=/; HttpOnly]}>
lippia_1  | 08/09/20 17:11:39 INFO  BasicHook:35 - ------ Ending -----Example scenario for input parameters-----
lippia_1  | 08/09/20 17:11:39 INFO  RestClient:90 - >>>Response: <201 Created,api.model.UserCreated@68e41f65,{Date=[Tue, 08 Sep 2020 17:11:39 GMT], Content-Type=[application/json; charset=utf-8], Content-Length=[80], Connection=[keep-alive], Set-Cookie=[__cfduid=d06ed84d889d9ad6a0a1e5e85d1aab0a41599585099; expires=Thu, 08-Oct-20 17:11:39 GMT; path=/; domain=.reqres.in; HttpOnly; SameSite=Lax; Secure], X-Powered-By=[Express], Access-Control-Allow-Origin=[*], Etag=[W/"50-TilfMnduwRRUzQcT4oGnBccp4mM"], Via=[1.1 vegur], CF-Cache-Status=[DYNAMIC], cf-request-id=[05104cb613000008f181220200000001], Expect-CT=[max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"], Server=[cloudflare], CF-RAY=[5cfa4a368e5b08f1-EZE]}>
lippia_1  | 08/09/20 17:11:39 INFO  BasicHook:35 - ------ Ending -----Example scenario for get user data-----
lippia_1  | 08/09/20 17:11:39 INFO  RestClient:90 - >>>Response: <201 Created,api.model.UserCreated@57b97da8,{Date=[Tue, 08 Sep 2020 17:11:39 GMT], Content-Type=[application/json; charset=utf-8], Content-Length=[80], Connection=[keep-alive], Set-Cookie=[__cfduid=dcebb09991cd857fd88d8a399a223c4731599585099; expires=Thu, 08-Oct-20 17:11:39 GMT; path=/; domain=.reqres.in; HttpOnly; SameSite=Lax; Secure], X-Powered-By=[Express], Access-Control-Allow-Origin=[*], Etag=[W/"50-WxAOKovtkqnHEwSBx30dIlS+AoY"], Via=[1.1 vegur], CF-Cache-Status=[DYNAMIC], cf-request-id=[05104cb618000008b81fb7a200000001], Expect-CT=[max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"], Server=[cloudflare], CF-RAY=[5cfa4a368c3208b8-EZE]}>
lippia_1  | 08/09/20 17:11:39 INFO  BasicHook:35 - ------ Ending -----Example scenario for get user data-----
lippia_1  | 08/09/20 17:11:39 INFO  RestClient:90 - >>>Response: <201 Created,api.model.UserCreated@45523162,{Date=[Tue, 08 Sep 2020 17:11:39 GMT], Content-Type=[application/json; charset=utf-8], Content-Length=[80], Connection=[keep-alive], Set-Cookie=[__cfduid=d4585eed263b3f7bfe556108d4e8398921599585099; expires=Thu, 08-Oct-20 17:11:39 GMT; path=/; domain=.reqres.in; HttpOnly; SameSite=Lax; Secure], X-Powered-By=[Express], Access-Control-Allow-Origin=[*], Etag=[W/"50-vR3erxZtL/w7IMPJ/9yz6BejjXE"], Via=[1.1 vegur], CF-Cache-Status=[DYNAMIC], cf-request-id=[05104cb618000008b466abd200000001], Expect-CT=[max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"], Server=[cloudflare], CF-RAY=[5cfa4a3689ef08b4-EZE]}>
lippia_1  | 08/09/20 17:11:39 INFO  BasicHook:35 - ------ Ending -----Example scenario for get user data-----
lippia_1  | 08/09/20 17:11:39 INFO  RestClient:90 - >>>Response: <200 OK,api.model.Data@4a082bc9,{Date=[Tue, 08 Sep 2020 17:11:39 GMT], Content-Type=[application/json; charset=utf-8], Transfer-Encoding=[chunked], Connection=[keep-alive], Set-Cookie=[__cfduid=d4585eed263b3f7bfe556108d4e8398921599585099; expires=Thu, 08-Oct-20 17:11:39 GMT; path=/; domain=.reqres.in; HttpOnly; SameSite=Lax; Secure], X-Powered-By=[Express], Access-Control-Allow-Origin=[*], Etag=[W/"173-1Z8bn0V7UjH6FK7NCaza1ccWXQk"], Via=[1.1 vegur], Cache-Control=[max-age=14400], CF-Cache-Status=[MISS], cf-request-id=[05104cb614000008b46f1a6200000001], Expect-CT=[max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"], Vary=[Accept-Encoding], Server=[cloudflare], CF-RAY=[5cfa4a3689e308b4-EZE]}>
lippia_1  | 08/09/20 17:11:39 INFO  BasicHook:35 - ------ Ending -----Example scenario for get user data-----
lippia_1  | Feature: Api example
lippia_1  |   As an api user I want to execute request in order to get proper responses
lippia_1  | 
lippia_1  |   @Example @Success
lippia_1  |   Scenario Outline: Example scenario for get user data # src/test/resources/features/ApiExample.feature:5
lippia_1  |     When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
lippia_1  |     Then I will get the proper status code '<statusCode>'
lippia_1  |     And The proper 'Id' '<id>' returned in the response
lippia_1  | 
lippia_1  |     Examples: 
lippia_1  | 
lippia_1  |   @Example @Success
lippia_1  |   Scenario Outline: Example scenario for get user data                      # src/test/resources/features/ApiExample.feature:12
lippia_1  |     When I perform a 'GET' to 'USER' endpoint with the 'exampleJson' and '' # UserSteps.doRequest(String,String,String,String)
lippia_1  |     Then I will get the proper status code '200'                            # UserSteps.iWillGetTheProperStatusCodeStatusCode(String)
lippia_1  |     And The proper 'Id' '2' returned in the response                        # UserSteps.theProperIdReturnedInTheResponse(String,String)
lippia_1  | 
lippia_1  |   @Example @Success
lippia_1  |   Scenario Outline: Example scenario for get user data                      # src/test/resources/features/ApiExample.feature:13
lippia_1  |     When I perform a 'POST' to 'USER' endpoint with the 'createUser' and '' # UserSteps.doRequest(String,String,String,String)
lippia_1  |     Then I will get the proper status code '201'                            # UserSteps.iWillGetTheProperStatusCodeStatusCode(String)
lippia_1  |     And The proper 'Id' '' returned in the response                         # UserSteps.theProperIdReturnedInTheResponse(String,String)
lippia_1  | 
lippia_1  |   @Example @Success
lippia_1  |   Scenario Outline: Example scenario for get user data                      # src/test/resources/features/ApiExample.feature:14
lippia_1  |     When I perform a 'POST' to 'USER' endpoint with the 'createUser' and '' # UserSteps.doRequest(String,String,String,String)
lippia_1  |     Then I will get the proper status code '201'                            # UserSteps.iWillGetTheProperStatusCodeStatusCode(String)
lippia_1  |     And The proper 'Id' '' returned in the response                         # UserSteps.theProperIdReturnedInTheResponse(String,String)
lippia_1  | 
lippia_1  |   @Example @Success
lippia_1  |   Scenario Outline: Example scenario for get user data                      # src/test/resources/features/ApiExample.feature:15
lippia_1  |     When I perform a 'POST' to 'USER' endpoint with the 'createUser' and '' # UserSteps.doRequest(String,String,String,String)
lippia_1  |     Then I will get the proper status code '201'                            # UserSteps.iWillGetTheProperStatusCodeStatusCode(String)
lippia_1  |     And The proper 'Id' '' returned in the response                         # UserSteps.theProperIdReturnedInTheResponse(String,String)
lippia_1  | 
lippia_1  |   @Example @Success
lippia_1  |   Scenario Outline: Example scenario for input parameters # src/test/resources/features/ApiExample.feature:29
lippia_1  |     When I perform a '<operation>' to '<entity>' endpoint with the '<jsonRequestName>' and '<inputParameters>'
lippia_1  |     Then I will get the proper status code '<statusCode>'
lippia_1  |     And I will get the proper response in '<jsonResponseName>'
lippia_1  | 
lippia_1  |     Examples: 
lippia_1  | 
lippia_1  |   @Example @Success
lippia_1  |   Scenario Outline: Example scenario for input parameters                                                                 # src/test/resources/features/ApiExample.feature:36
lippia_1  |     When I perform a 'GET' to 'RESPONSE_HEADERS' endpoint with the 'responseHeadersRequest' and 'value1:bar1,value2:bar2' # UserSteps.doRequest(String,String,String,String)
lippia_1  |     Then I will get the proper status code '200'                                                                          # UserSteps.iWillGetTheProperStatusCodeStatusCode(String)
lippia_1  |     And I will get the proper response in 'responseHeadersResponse'                                                       # ResponseHeadersSteps.iWillGetTheProperResponse(String)
lippia_1  | [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.033 s - in TestSuite
lippia_1  | [INFO] 
lippia_1  | [INFO] Results:
lippia_1  | [INFO] 
lippia_1  | [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
lippia_1  | [INFO] 
lippia_1  | [INFO] ------------------------------------------------------------------------
lippia_1  | [INFO] BUILD SUCCESS
lippia_1  | [INFO] ------------------------------------------------------------------------
lippia_1  | [INFO] Total time:  16.357 s
lippia_1  | [INFO] Finished at: 2020-09-08T17:11:40Z
lippia_1  | [INFO] ------------------------------------------------------------------------
lippia-api-sample-project_lippia_1 exited with code 0

```
> This strategy consumes the bonigarcia solution to get the correct Driver to interact with your browser.
>In this case, Maven will be excute tests phase by using your local browser directly.

#### Stack strategy
This strategy use docker containers to generate a context to execute the tests. 
Through docker compose we configure the following  

-	Selenium hub  
-  	Browser nodes  

 > This command, will start download the images needed to build all the containers and start them. It takes a while to download the images depending on your internet connection.

![docker-compose-up](images/docker-compose-up.png)
