FROM java:latest

VOLUME /FitNesse
EXPOSE 90000

CMD java -Xmx512m -jar fitnesse-standalone.jar
