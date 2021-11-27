
FROM openjdk:11
ARG PROJECT_VERSION=0.1.0
RUN mkdir -p /home/app
WORKDIR /home/app
ENV SPRING_PROFILES_ACTIVE=dev
COPY . .
ADD cloud-config/target/cloud-config-v${PROJECT_VERSION}.jar cloud-config.jar
EXPOSE 9296
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "cloud-config.jar"]


