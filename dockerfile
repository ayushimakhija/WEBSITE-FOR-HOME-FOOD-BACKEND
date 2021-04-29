FROM tomcat:latest
LABEL maintainer="Pavan_Singh"
ADD ./target/SPE_PROJECT-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/
EXPOSE 3000
CMD ["catalina.sh", "run"]
