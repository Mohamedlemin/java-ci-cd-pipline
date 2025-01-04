# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the final JAR (we'll build it via Maven)
COPY target/demo-app-0.0.1-SNAPSHOT.jar /app/demo-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/demo-app.jar"]
