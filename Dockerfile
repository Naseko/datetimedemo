FROM openjdk:17.0.1-jdk-slim as jdkbase
FROM jdkbase

ADD target/demo.jar /run/demo.jar
#ADD target/classes/sql /run/sql

ENTRYPOINT ["java","-jar","run/demo.jar","-Xms128m","-Xmx4096m"]
