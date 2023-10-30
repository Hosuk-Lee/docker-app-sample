# 기본 이미지 선택 (Java를 사용하는 경우)
#FROM openjdk:17
# 작업 디렉토리 생성
#WORKDIR /app
# Gradle 빌드 결과물을 현재 디렉토리로 복사
#COPY build/libs/*.jar app.jar
# 컨테이너 내부에서 실행할 명령
#CMD ["java", "-jar", "app.jar"]

# BUILD
FROM maven:3.9.3-eclipse-temurin-17 AS builder
WORKDIR /workdir
# Maven POM 파일 복사
COPY pom.xml /workdir/pom.xml
#RUN mvn dependency:go-offline
# 소스 디렉토리 복사
COPY src /workdir/src
RUN mvn install

# 압축해제 (sb 필요없음)
#RUN mkdir -p target/dependency
#WORKDIR /workdir/target/dependency
#RUN jar -xf ../*.jar

# IMAGE BUILD
FROM openjdk:17
#EXPOSE 8080
#VOLUME /tmp
ARG TARGET_DIR=/workdir/target
COPY --from=builder ${DEPENDENCY}/*.jar app.jar
CMD ["java", "-jar", "app.jar"]

#ARG DEPENDENCY=/workdir/target/dependency
#COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
#COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*","com.company.project.Application"]