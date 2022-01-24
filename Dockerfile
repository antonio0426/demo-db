
FROM maven:3.5-jdk-8-alpine as build

COPY src /usr/src/demo-db/src
COPY pom.xml /usr/src/demo-db
RUN mvn -f /usr/src/demo-db/pom.xml clean package -DskipTests

FROM openjdk:8-jre-alpine
COPY --from=build /usr/src/demo-db/target/demo-db-0.0.1-SNAPSHOT.jar /usr/demo-db/demo-db-0.0.1-SNAPSHOT.jar

expose 8081
ENTRYPOINT ["java","-D","-Djasypt.encryptor.password=javatechie", "-jar","/usr/demo-db/demo-db-0.0.1-SNAPSHOT.jar"]

#javatechie e' la chiave privata che serve per criptare tutte le stringhe quindi andrebbe anch'essa protetta