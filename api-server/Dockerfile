# 기본 이미지 선택 (Java를 사용하는 경우)
FROM openjdk:17

# 작업 디렉토리 생성
WORKDIR /app

# Gradle 빌드 결과물을 현재 디렉토리로 복사
COPY build/libs/*.jar app.jar

# 컨테이너 내부에서 실행할 명령
CMD ["java", "-jar", "app.jar"]
