FROM java:8-jdk
MAINTAINER Pedro F. Alonso <pedro.alonso.garcia@accenture.com>
#comentario para pruebas
#segundo comentario de pruebas
VOLUME /tmp
ADD https://github.com/Pedro-F/meccano/blob/master/MicroservicioA/target/MicroservicioA-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
