
FROM openjdk:11-alpine
ARG PROJECT_VERSION=0.1.0
RUN mkdir -p /home/app
WORKDIR /home/app
ENV SPRING_PROFILES_ACTIVE=dev
COPY order-service/ .
ADD order-service/target/order-service-v${PROJECT_VERSION}.jar order-service.jar
EXPOSE 8300
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "order-service.jar"]


