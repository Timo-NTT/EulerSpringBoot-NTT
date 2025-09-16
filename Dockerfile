FROM amazoncorretto:21-alpine-jdk

USER root
WORKDIR /

# COPY the java startup script
COPY scripts/entrypoint-services.sh .

# COPY the built java application
COPY build/libs/evp-backend-LOCAL-BUILD.jar /opt/

# Start up Invoice-Service
ENTRYPOINT [ "/bin/sh" ]
CMD [ "/entrypoint-services.sh" ]