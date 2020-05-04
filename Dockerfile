FROM openjdk:11
EXPOSE 8080
ADD target/mini_project-0.0.1-SNAPSHOT.jar mini_project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/mini_project-0.0.1-SNAPSHOT.jar"]
