# clea-architecture-utils

# **Introduction**
This is a guided Java architecture sample that provides a reference for implementing a clean architecture in a Java application. You can replicate this approach in various projects without being concerned about specific frameworks, business logic, or concrete project requirements. This sample includes examples of a **REST Controller**, a Kafka Consumer and producer, AWS Lambda function implementations, and Spring Boot application environments.

# Dependencies:
SDK: Corretto-21.0.4.7.1
Gradle: gradle-8.5
# **Project Structure**
my-app/
```
├── application
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── clean_architecture_utils
│       │   └── resources
│       └── test
│           ├── java
│           └── resources
├── domain
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       └── main
│   │   │           └── com
│   │   │               └── clean_architecture_utils
│   │   └── tmp
│   │       └── compileJava
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── clean_architecture_utils
│       │   └── resources
│       └── test
│           ├── java
│           └── resources
├── gradle
│   └── wrapper
├── infrastructure
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       └── main
│   │   │           └── com
│   │   │               └── clean_architecture_utils
│   │   │                   └── spring
│   │   │                       └── rest_controllers
│   │   ├── resources
│   │   │   └── main
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── clean_architecture_utils
│       │   │           ├── kafka
│       │   │           └── spring
│       │   │               └── rest_controllers
│       │   └── resources
│       └── test
│           ├── java
│           └── resources
└── scripts
    ├── examples
    └── requests
```
Each layer in this application is separated into three main modules: _Infrastructure, Application, and Domain_. If you are familiar with clean architecture, you will recognize the logical structure of the implementation. If you have suggestions or improvements, feel free to fork the repository and submit a pull request. It's free!!!

If you are not familiar with this approach, I invite you to explore the project and share any questions or concerns you have about my design decisions. I will do my best to provide examples and explanations to help you understand.
# **Implemented Modules**
1. SpringBoot Application: You can find the Spring Configuration in the root package of the underlying directory `infrastructure/src/main/java/com/clean_architecture_utils/spring`
2. RestController: This is an basic implementation, you can found in the infrastructure directory.

# **How to run applications?**
1. SpringBoot Application:
    1. Be aware of the application.properties is set with the port environment variable in the path: `/infrastructure/src/main/resources/application.properties` and set your preferable port, example `server.port=8080`
    2. Run application using the following commands:
        1. ` ./gradlew clean build`
        2. ` java -jar infrastructure/build/libs/infrastructure.jar`

    3. Test the rest controller: The following path `scripts/requests/check-service.sh` contains a shell script with a CURL that can be used for test the application once it is deployed:


`
