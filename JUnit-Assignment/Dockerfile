FROM alpine:3.20

WORKDIR /app

COPY target/*.jar app.jar

CMD ["sh","-c","echo 'Deployed artifact inside container:' && ls -l /app/app.jar"]