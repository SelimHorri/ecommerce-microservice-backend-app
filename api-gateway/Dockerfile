
FROM openjdk:11
ARG PROJECT_VERSION=0.1.0
RUN mkdir -p /home/app
WORKDIR /home/app
ENV SPRING_PROFILES_ACTIVE=dev
ENV SPRING_ZIPKIN_BASE_URL=http://zipkin-container:9411/
ENV SPRING_CONFIG_IMPORT=optional:configserver:http://cloud-config-container:9296
ENV EUREKA_CLIENT_SERVICE_URL_DEFAULTZONE=http://user-service-container:8761/eureka
ENV EUREKA_INSTANCE=user-service-container
COPY . .
ADD api-gateway/target/api-gateway-v${PROJECT_VERSION}.jar api-gateway.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "api-gateway.jar"]


