FROM openjdk:11.0-oracle
COPY "./target/ConfigServer-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "app.jar"]