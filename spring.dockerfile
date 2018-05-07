FROM java:8

MAINTAINER Andre Papazoglu

COPY ./target/mystore-0.0.1-SNAPSHOT.jar /tmp/mystore-0.0.1-SNAPSHOT.jar

WORKDIR /tmp/

ENTRYPOINT [ "java", "-jar", "mystore-0.0.1-SNAPSHOT.jar" ]

EXPOSE 8080