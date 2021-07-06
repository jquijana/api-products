FROM openjdk:11.0.11
ENV TZ=America/Lima
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN mkdir /app
COPY build/libs/*.jar /app/api-products-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD java -Djdk.tls.client.protocols="TLSv1,TLSv1.1,TLSv1.2" -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar /app/api-products-0.0.1-SNAPSHOT.jar


