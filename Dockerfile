FROM openjdk:17-alpine

RUN mkdir -p /var/opt/app

COPY ./target/*.jar /var/opt/mytest.jar

WORKDIR /var/opt/

ENTRYPOINT ["java", "-jar", "mytest.jar"]