FROM amazoncorretto:21-alpine-jdk

RUN apk add --no-cache curl
# Arbeitsverzeichnis im Container setzen
WORKDIR /app



# Script und JAR ins Image kopieren
COPY entrypoint.sh /app/entrypoint.sh
COPY target/entrypoint.jar /app/app.jar

# Script ausführbar machen
RUN chmod +x /app/entrypoint.sh

