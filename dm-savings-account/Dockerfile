# BUILD
FROM maven:3.9.3-eclipse-temurin-17 AS builder
WORKDIR /workdir
# Maven POM 파일 복사
COPY pom.xml /workdir/pom.xml
#RUN mvn dependency:go-offline
# 소스 디렉토리 복사
COPY src /workdir/src
RUN mvn install

# IMAGE BUILD
FROM openjdk:17
#EXPOSE 8080
#VOLUME /tmp
ARG TARGET_DIR=/workdir/target
COPY --from=builder ${TARGET_DIR}/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
