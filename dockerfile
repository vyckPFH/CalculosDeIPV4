# Usa o JDK 21 completo baseado em Ubuntu
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY Main.java .

RUN javac Main.java

EXPOSE 8090

CMD [ "java", "Main" ]

