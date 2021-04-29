FROM tomcat:latest
LABEL maintainer="Pavan_Singh"
ADD ./target/SPE_PROJECT-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/
EXPOSE 8082
CMD ["catalina.sh", "run"]
