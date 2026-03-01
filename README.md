# Microserviço de Cadastro de pedidos - Java Spring
Este repositório contém a segunda parte de um projeto de microserviços desenvolvido com **Java Spring**, com foco, na prática de comunicação assíncrona entre serviços. 

## Descrição

A api recebe os dados vindo de uma fila de mensagens (RabbitMQ) e os salva em um banco de dados.

## Tecnologias  Utilizadas

- **Java + Spring Boot** – Framework principal da aplicação.
- **RabbitMQ** com **CloudAMQP** – Comunicação assíncrona entre serviços.
- **PostgreSQL** – Persistência dos dados.
- **Lombok** – Uso da anotação `@Slf4j` para geração de logs.
- **Spring Boot Actuator** – Monitoramento da aplicação.

## Requisitos

- Java 21
- Maven
- PostgreSQL

## Executando o Projeto

1. Clone o repositório 1:

```bash
git  https://github.com/bispobr/Spring-java-microservice-processamento.git
```
2. Clone o repositório 2:

```bash
git https://github.com/bispobr/Spring-java-microservice-pedido.git
```

3. Altere o arquivo de configuração **application.properties** com as credenciais de login do PostgreSQL e endereços Rabbitmq do seu ambiente.
## Como usar

1. Inicie a aplicação 
2. API está acessivel atraves do endereço http://localhost:8082
3. O endpoint de saúde e métricas do Actuator está acessível através do Link http://localhost:8082/actuator
