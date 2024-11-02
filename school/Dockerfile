# Base image olarak OpenJDK 17 kullan
FROM openjdk:17-jdk-slim

# Uygulamanın JAR dosyasını ekle
ARG JAR_FILE=target/school-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Uygulamayı başlat
ENTRYPOINT ["java", "-jar", "/app.jar"]
