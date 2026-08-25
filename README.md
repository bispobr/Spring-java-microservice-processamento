# Processing Service

Microsserviço responsável pelo processamento assíncrono de pedidos recebidos através do RabbitMQ.

Este serviço faz parte de um conjunto de microsserviços desenvolvido com Java e Spring Boot.

## Arquitetura

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

O serviço consome mensagens disponibilizadas pelo Order Service e persiste os dados recebidos.

## Responsabilidades

- Consumir mensagens do RabbitMQ
- Processar dados de pedidos
- Persistir os dados processados
- Disponibilizar informações de saúde e métricas da aplicação

## Tecnologias

- Java 21
- Spring Boot
- Spring AMQP
- RabbitMQ / CloudAMQP
- PostgreSQL
- Spring Data JPA
- Spring Boot Actuator
- JUnit 5
- Mockito

## Requisitos

- Java 21
- Maven
- PostgreSQL
- RabbitMQ ou CloudAMQP

## Configuração

As configurações de banco de dados e RabbitMQ podem ser fornecidas por variáveis de ambiente.

Exemplo:

```properties
DB_URL=jdbc:postgresql://localhost:5432/microservice-processamento
DB_USERNAME=postgres
DB_PASSWORD=senha
RABBITMQ_ADDRESSES=amqps://...
RABBITMQ_PROCESSING_QUEUE=...
```

Os valores devem ser configurados de acordo com o ambiente utilizado.

## Executando

Clone o repositório:

```bash
git clone https://github.com/bispobr/Spring-java-microservice-processamento.git
cd Spring-java-microservice-processamento
```

Execute:

```bash
./mvnw spring-boot:run
```

A aplicação utiliza a porta `8082`.

## Actuator

O Spring Boot Actuator disponibiliza informações de saúde e métricas da aplicação.

Endpoint:

```text
http://localhost:8082/actuator
```

## Testes

```bash
./mvnw test
```

## Serviços relacionados

- [Order Service](https://github.com/bispobr/Spring-java-microservice-pedido)
- [User Service](https://github.com/bispobr/Spring-java-microservice-usuario)
- [Email Service](https://github.com/bispobr/Spring-java-microservice-email)

## Status

Projeto de estudo desenvolvido para praticar comunicação assíncrona, mensageria e processamento de dados utilizando Java e Spring Boot.
