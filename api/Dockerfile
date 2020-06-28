FROM maven:3.6.3 as build
WORKDIR /opt/build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src/* src/
RUN mvn clean package -DskipTest

FROM openjdk:14-alpine
WORKDIR /app
COPY --from=build /opt/build/*.jar app.jar

ENTRYPOINT ["java", "-jar" "/app/app.jar"]
