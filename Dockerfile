#FROM gradle:8-jdk17 AS build
#WORKDIR /app
#COPY gradle gradle
#COPY gradlew build.gradle.kts settings.gradle.kts ./
#COPY src src
#RUN gradle build -x test --no-daemon
#
#FROM openjdk:17-jdk-slim
#WORKDIR /app
#COPY --from=build /app/build/libs/*.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75.0", "-Dserver.address=0.0.0.0", "-jar", "app.jar"]


# --- Build stage: Compile your project using GraalVM JDK 17 ---
FROM ghcr.io/graalvm/jdk-community:17 AS build

# Install required utilities
RUN microdnf install -y findutils && microdnf clean all

WORKDIR /app
COPY gradle gradle
COPY gradlew build.gradle.kts settings.gradle.kts ./
COPY src src
RUN ./gradlew build -x test --no-daemon

# --- Runtime stage: Use GraalVM for the JVM ---
FROM ghcr.io/graalvm/jdk-community:17
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75.0", "-Dserver.address=0.0.0.0", "-jar", "app.jar"]
