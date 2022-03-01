FROM tomcat:9-jre8-temurin
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8
COPY target/bibliotheek-web-dmaog.war /usr/local/tomcat/webapps/ROOT.war
COPY books.shexml books.shexml
COPY BIBLIOTHEEK_versie2021.mdb BIBLIOTHEEK_versie2021.mdb
EXPOSE 8080
CMD ["catalina.sh", "run"]