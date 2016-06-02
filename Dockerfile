FROM java:8-jdk
MAINTAINER Pedro F. Alonso <pedro.alonso.garcia@accenture.com>
VOLUME /tmp
ADD MicroservicioA-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
