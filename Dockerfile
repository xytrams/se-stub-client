FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift
VOLUME /tmp

COPY target/se-stub-client-0.0.1-SNAPSHOT.jar se-stub-client.jar
 
EXPOSE 8080 8090

RUN ls -la ~/*

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/.urandom", "-jar", "se-stub-client.jar"]
