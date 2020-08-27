# Lambda-Java

This project is a basic Java project that will be packaged and deployed into a AWS Lambda function.

## Test
Run the following command:
```
mvn test -f lambda-java/pom.xml
```

## Package

Run the following command:
```
mvn package -f lambda-java/pom.xml
```

## Publish
Take the jar file that was produced from the above package step and upload it into AWS Lambda.