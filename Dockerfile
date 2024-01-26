FROM eclipse-temurin:17-jre-jammy

COPY target/*.jar /opt/demo-mvc-only-service.jar

ENTRYPOINT ["sh","-c","java -Xmx256m -jar /opt/demo-mvc-only-service.jar"]
EXPOSE 8080/tcp