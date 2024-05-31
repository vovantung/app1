FROM amazoncorretto:17
COPY target/app1.jar /app1.jar
ENTRYPOINT ["java","-jar","/app1.jar"]

EXPOSE 8080