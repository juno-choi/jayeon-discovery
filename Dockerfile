FROM openjdk:11-ea-27-jdk-slim

VOLUME /tmp

# jar파일 복사
COPY build/libs/jayeon-discovery-1.0.jar discovery.jar
ENTRYPOINT ["java","-jar","discovery.jar"]