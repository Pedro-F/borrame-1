FROM java:8-jdk
MAINTAINER Pedro F. Alonso <pedro.alonso.garcia@accenture.com>
#RUN echo "root:Docker!" | password
USER root
VOLUME /tmp
#comentario para el maste antes del hotfix
ADD MicroservicioA-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
