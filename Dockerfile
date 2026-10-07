FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/java-cicd-demo-1.0.0.jar app.jar

EXPOSE 5050

ENTRYPOINT ["java", "-jar", "app.jar"]
