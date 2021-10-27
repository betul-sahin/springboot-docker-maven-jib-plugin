FROM openjdk:8

EXPOSE 8080

ADD target/*.jar springboot-docker-demo.jar

ENTRYPOINT ["java", "-jar", "/springboot-docker-demo.jar"]
