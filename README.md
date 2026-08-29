# Spring Java Microservice - Processamento

Microsserviço responsável pelo processamento assíncrono dos pedidos recebidos através do RabbitMQ.

O serviço faz parte de uma arquitetura de microsserviços desenvolvida com Java e Spring Boot.

## 🏗️ Arquitetura

Fluxo simplificado:

```text
Order Service
     │
     ▼
 RabbitMQ
     │
     ▼
Processing Service
     │
     ▼
 PostgreSQL
```

O serviço consome as mensagens publicadas pelo `Order Service`, processa os pedidos e persiste as informações necessárias no PostgreSQL.

## Responsabilidades

* Consumir mensagens de pedidos do RabbitMQ
* Processar os pedidos recebidos
* Persistir os dados processados
* Disponibilizar informações de saúde da aplicação
* Permitir acompanhamento das métricas da aplicação

## 🛠️ Tecnologias

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Spring AMQP
* RabbitMQ / CloudAMQP
* PostgreSQL
* H2
* Springdoc OpenAPI
* Spring Boot Actuator
* JUnit 5
* Mockito

## 📋 Requisitos

* Java 21
* Maven
* PostgreSQL
* RabbitMQ ou CloudAMQP

## ⚙️ Configuração

As configurações de banco de dados e mensageria podem ser fornecidas por variáveis de ambiente.

| Variável                    | Descrição                           | Exemplo                                                       |
| --------------------------- | ----------------------------------- | ------------------------------------------------------------- |
| `DB_URL`                    | URL de conexão com o PostgreSQL     | `jdbc:postgresql://localhost:5432/microservice-processamento` |
| `DB_USERNAME`               | Usuário do PostgreSQL               | `postgres`                                                    |
| `DB_PASSWORD`               | Senha do PostgreSQL                 | `senha`                                                       |
| `JPA_DDL_AUTO`              | Estratégia de atualização do schema | `update`                                                      |
| `RABBITMQ_ADDRESSES`        | Endereço do RabbitMQ ou CloudAMQP   | `amqps://...`                                                 |
| `RABBITMQ_PROCESSING_QUEUE` | Nome da fila consumida pelo serviço | `...`                                                         |

## ▶️ Executando

Clone o repositório:

```bash
git clone https://github.com/bispobr/Spring-java-microservice-processamento.git
cd Spring-java-microservice-processamento
```

Compile e execute:

```bash
./mvnw clean package
./mvnw spring-boot:run
```

A aplicação utiliza a porta `8082`.

## 📚 API

A aplicação disponibiliza documentação através do Swagger/OpenAPI.

```text
http://localhost:8082/swagger-ui/index.html
```

## ❤️ Actuator

Endpoint de saúde:

```text
http://localhost:8082/actuator/health
```

O Actuator também disponibiliza métricas da aplicação.

## 🧪 Testes

Execute os testes com:

```bash
./mvnw test
```

## 🔗 Serviços relacionados

* [Order Service](https://github.com/bispobr/Spring-java-microservice-pedido)
* [User Service](https://github.com/bispobr/Spring-java-microservice-usuario)
* [Email Service](https://github.com/bispobr/Spring-java-microservice-email)

## 📌 Status

Projeto de estudo desenvolvido para praticar processamento assíncrono, mensageria com RabbitMQ, persistência de dados e comunicação entre microsserviços utilizando Spring Boot.
