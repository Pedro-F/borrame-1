FROM java:8-jdk
MAINTAINER Pedro F. Alonso <pedro.alonso.garcia@accenture.com>

ENV JAVA_HOME              /usr/lib/jvm/java-8-openjdk-amd64
ENV JAVA_OPTS              ""
ENV PATH                   $PATH:$JAVA_HOME/bin

#ENV TIME_ZONE              Europe/Madrid
#ENV CUSTOM_LOCAL_NAME      unknown-host
#ENV SPRING_PROFILES_ACTIVE test

#RUN apt-get update && apt-get install -y \
#    curl \
#    && rm -rf /var/lib/apt/lists/*

#RUN echo "$TIME_ZONE" > /etc/timezone
#RUN dpkg-reconfigure -f noninteractive tzdata

#COPY app.jar /app/app.jar
RUN mvn package && java -jar target/gs-spring-boot-0.1.0.jar
COPY target/gs-spring-boot-0.1.0.jar /app/gs-spring-boot-0.1.0.jar
WORKDIR /app

EXPOSE 8080

#ONBUILD COPY app.jar /app/app.jar

CMD ["/bin/sh", "-c", "java $JAVA_OPTS -DCUSTOM_LOCAL_NAME=$CUSTOM_LOCAL_NAME -jar /app/app.jar --spring.profiles.active=$SPRING_PROFILES_ACTIVE"]
