FROM maven:3-openjdk-17

WORKDIR /workspace

COPY bin .

ENV WAIT_VERSION 2.7.2
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/$WAIT_VERSION/wait /wait
RUN chmod +x /wait

# ENTRYPOINT ["mvn"]
# 
CMD "mvn clean spring-boot:run"
