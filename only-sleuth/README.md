# Example for Spring Cloud Sleuth 

## MODULES

#### server-one
Serving  GET request on `/` path. This request ends up with calling server-two via Feign on GET `/cat`
and returning its response.

#### server-two
Serving requests on `/cat` path.

## TECH STACK
- Java 11
- Spring Boot Framework
- Spring Cloud Sleuth
- Spring Cloud Feign
- docker-compose
- spotify maven dockerfile plugin

Both services use the dockerfile-maven plugin from Spotify to make the Docker build process integrate with the Maven build process. 
So when we build a Spring Boot artifact, we’ll also build a Docker image for it. 
For more details, check the Dockerfile and the pom.xml of each service.


## LOGGING
As the microservices will run in Docker containers, we can leave the responsibility of writing the log files to Docker. 

logback-spring.xml configures the logging params based on spring active profile.

## USAGE

1. `./mvnw clean install`
2. `docker-compose -f docker/docker-compose up --build`
3. request `curl localhost:8080` & response should be "Hello Cat"
4. you should see span id and trace id the logs that can drive your trough on your process
