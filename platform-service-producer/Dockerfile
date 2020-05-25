FROM openjdk:11
MAINTAINER Lombos Monika <lombos.monika@gmail.com>

VOLUME /tmp

ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","-Dspring.profiles.active=docker","io.lombocska.servertwo.PlatformServiceProducerApplication"]
