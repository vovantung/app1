FROM amazoncorretto:17
VOLUME /tmp
COPY target/*.jar app1.jar
ENTRYPOINT ["java","-jar","/app1.jar"]

EXPOSE 8080