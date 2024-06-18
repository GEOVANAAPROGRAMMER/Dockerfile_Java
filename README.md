# DimMoneyApp
DimMoneyApp é uma aplicação Java desenvolvida usando Jakarta EE e o framework Jersey, configurada para ser executada no servidor Tomcat 10. A aplicação possui um endpoint simples que confirma o sucesso do deploy.
## Funcionalidades
 - **Mensagem de Deploy:** Um endpoint simples que retorna uma mensagem confirmando o sucesso do deploy.
## Estrutura do Projeto
### Pacote Principal
`br.com.fiap.DimMoneyAppRm552539`
### Classes
 - **HelloApplication:** Configura o caminho base da aplicação.
 - **HomeResource:** Define um endpoint que retorna uma mensagem de sucesso.
 - **Frontend:** Um arquivo HTML simples que contém links para os recursos da aplicação e informações sobre o projeto Jersey.
## Configuração
- **Dockerfile:** Configura a aplicação para ser executada dentro de um contêiner Docker usando a imagem do Tomcat.
- **pom.xml:** Configura as dependências e plugins necessários para compilar e empacotar a aplicação.
## Executando o Projeto
1. **Compile o projeto:** Use o Maven para compilar e gerar o arquivo WAR.
```bash
mvn clean package
```
2. **Construa a imagem Docker:** Construa a imagem Docker usando o Dockerfile.
```bash
docker build -t dimmoneyapp .
```
3. **Execute o contêiner Docker:** Inicie o contêiner Docker.
```bash
docker run -p 8080:8080 dimmoneyapp
```
4. **Acesse a aplicação:** Abra o navegador e vá para `http://localhost:8080/DimMoneyAppRm552539` para ver a mensagem de sucesso.
