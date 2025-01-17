# THERAPY CONNECT #

## Requirements ##
- Java 21
- Maven demon (recommended) or Maven
- IntelliJ IDEA (recommended) or another IDE
  - Checkstyle plugin

### Configure checkstyle plugin in IntelliJ IDEA ###
1. Open IntelliJ IDEA
2. Go to File -> Settings -> Plugins
3. Search for CheckStyle
4. Install the plugin
5. Go to File -> Settings -> Tools -> Checkstyle -> Add configuration file -> Select the `checkstyle.xml` file from the root project directory

```sh
mvn --batch-mode checkstyle:check
```

## How to run ##

1. Clone the repository
2. Open the terminal and navigate to the root project directory
3. Run the following command to build the project
```sh
mvn clean build
```
4. Open the terminal and navigate to the docker directory
```sh
docker-compose up
```

Project can be run and accessed at http://localhost:8072
