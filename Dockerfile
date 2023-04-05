FROM openjdk:17-alpine

EXPOSE 8080

# Copiar el archivo JAR de la aplicación en la imagen
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Copiar los archivos de configuración de Spring Security
COPY ./src/main/java/com/example/demo/config/ /security-config/

# Establecer las propiedades de sistema para la aplicación
ENV SPRING_CONFIG_LOCATION=/security-config/

ENTRYPOINT ["java","-jar","app.jar"]