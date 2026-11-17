# Tutorial de Implementação do Trabalho

## Introdução
Este tutorial tem como objetivo guiar você na implementação do trabalho utilizando Java e Docker. Vamos abordar os conceitos fundamentais e os passos necessários para configurar o ambiente e executar a aplicação.

## Requisitos
- **Java JDK 21**: Certifique-se de ter o JDK 21 instalado em sua máquina.
- **Docker**: Instale o Docker para criar e gerenciar contêineres.

## Estrutura do Projeto
O projeto possui a seguinte estrutura:
```
CalculosDeIPV4/
├── dockerfile
└── Main.java
```

### Main.java
O arquivo `Main.java` contém o código principal da aplicação. Aqui está um exemplo do que ele pode conter:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Dockerfile
O `dockerfile` é utilizado para criar a imagem Docker da aplicação. Aqui está um exemplo do conteúdo:
```dockerfile
# Usa o JDK 21 completo baseado em Ubuntu
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "app.jar"]
```

## Passos para Implementação
1. **Configurar o Ambiente**
   - Instale o JDK 21 e o Docker.

2. **Criar o Projeto**
   - Crie uma nova pasta chamada `CalculosDeIPV4` e adicione os arquivos `Main.java` e `dockerfile` conforme a estrutura acima.

3. **Compilar o Projeto**
   - Navegue até a pasta do projeto e compile o código Java:
     ```bash
     javac Main.java
     ```

4. **Construir a Imagem Docker**
   - Execute o seguinte comando para construir a imagem:
     ```bash
     docker build -t calculos-ipv4 .
     ```

5. **Executar a Aplicação**
   - Após a construção da imagem, execute o contêiner:
     ```bash
     docker run -p 8090:8090 calculos-ipv4
     ```

## Conclusão
Seguindo este tutorial, você deve ser capaz de implementar e executar sua aplicação Java dentro de um contêiner Docker. Certifique-se de testar cada parte do trabalho para garantir que tudo esteja funcionando corretamente.

## Dicas
- Verifique se o Docker está em execução antes de tentar construir ou executar a imagem.
- Utilize `docker ps` para verificar se o contêiner está ativo.

---