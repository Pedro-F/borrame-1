FROM java:8-jdk
MAINTAINER Pedro F. Alonso <pedro.alonso.garcia@accenture.com>

ENV JAVA_HOME              /usr/lib/jvm/java-8-openjdk-amd64
ENV JAVA_OPTS              ""
ENV PATH                   $PATH:$JAVA_HOME/bin

#ENV TIME_ZONE              Europe/Madrid
#ENV CUSTOM_LOCAL_NAME      unknown-host
#ENV SPRING_PROFILES_ACTIVE test

RUN apt-get update && apt-get install -y \
    curl \
     && rm -rf /var/lib/apt/lists/*

RUN echo "$TIME_ZONE" > /etc/timezone
RUN dpkg-reconfigure -f noninteractive tzdata

#COPY https://github.com/Pedro-F/meccano.git /app/app.jar

ADD https://github.com/Pedro-F/meccano/blob/master/MicroservicioA/target/MicroservicioA-0.0.1-SNAPSHOT.jar /app/MicroservicioA-0.0.1-SNAPSHOT.jar
WORKDIR /app

EXPOSE 5080

CMD ["/bin/sh", "-c", "java $JAVA_OPTS -DCUSTOM_LOCAL_NAME=$CUSTOM_LOCAL_NAME -jar /app/MicroservicioA-0.0.1-SNAPSHOT.jar --spring.profiles.active=$SPRING_PROFILES_ACTIVE"]
