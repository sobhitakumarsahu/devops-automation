FROM openjdk:8
EXPOSE 9191
ADD target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java", "-jar", "devops-integration.jar"]
