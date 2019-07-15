FROM openjdk:8u212-jdk
VOLUME /tmp
ADD pago-servicio-banca-empresa-0.0.1-SNAPSHOT.jar app-banca-empresa.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java -jar /app-banca-empresa.jar" ]