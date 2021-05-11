FROM openjdk:11
VOLUME /tmp
EXPOSE 8082
ADD /target/SPE_BACKEND.jar SPE_BACKEND.jar
ENTRYPOINT ["java", "-jar", "SPE_BACKEND.jar"]
