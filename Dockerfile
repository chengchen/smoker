FROM openjdk:8u181-jre-alpine3.8

ADD target/potato-buggy.jar /srv/app.jar

VOLUME /tmp
EXPOSE 8080

CMD ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-XX:+ExitOnOutOfMemoryError", "-jar", "/srv/app.jar"]
