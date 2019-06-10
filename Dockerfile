FROM openjdk:12-apline

EXPOSE 8080

WORKDIR /app
COPY ...

ENTRYPOINT ["java", "-jar", "footballmanager.jar"]