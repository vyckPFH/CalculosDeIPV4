# Usa o JDK 21 completo baseado em Ubuntu
FROM eclipse-temurin:21-jdk 
# Define o diretório de trabalho dentro do contêiner
WORKDIR /app
# Copia o arquivo Main.java do diretório atual para o diretório de trabalho no contêiner
COPY Main.java .
# Compila o arquivo Main.java
RUN javac Main.java

# Define o comando padrão a ser executado quando o contêiner é iniciado
CMD [ "java", "Main" ]

