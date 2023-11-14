# BUILD
FROM maven:3.9.3-eclipse-temurin-17 AS builder
WORKDIR /app
# Maven POM 파일 복사
# COPY pom.xml /workdir/pom.xml
COPY pom.xml .
RUN mvn dependency:go-offline
# 소스 디렉토리 복사
COPY src/ /app/src/
RUN mvn package
RUN ls -al

# IMAGE BUILD
FROM openjdk:17
WORKDIR /app
EXPOSE 8080
# VOLUME /tmp
# ARG TARGET_DIR=/workdir/target
# COPY --from=builder ${TARGET_DIR}/*-SNAPSHOT.jar app.jar
COPY --from=builder /app/target/*-SNAPSHOT.jar /app/app.jar
# CMD ["java", "-jar", "app.jar"]
#ENTRYPOINT ["java", "-jar", "/app/app.jar"]
CMD ["java", "-version"]
CMD ["ls", "-al", "app.jar"]
CMD ["java", "-jar", "app.jar"]
