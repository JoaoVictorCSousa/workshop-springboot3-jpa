# Sistema de cadastrar usuários, vendas, produtos e pedidos, exibindo-os e suas relações.
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/JoaoVictorCSousa/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

É uma aplicação back-end que tem como objetivo criar um CRUD em JAVA, apresentando os princípios de operações básicas de armazenamento persistente.

A aplicação consiste em um modelo no qual a pessoa conseguirá cadastrar usuários, vendas, produtos, categorias, registrar pagamentos e exibir suas relações. Ex: Cliente de ID 1, comprou dois produtos X, da Categoria Y, por R$100.00 e no sistema, o pedido já consta como pago. Além disso, por ser uma operação CRUD, os usuários, categorias e produtos podem ser criados, atualizados, deletados e exibidos.

# Modelo Conceitual
![Domain Model](https://github.com/JoaoVictorCSousa/workshop-springboot3-jpa/blob/main/assets/domainModel.png)
![Domain Instance](https://github.com/JoaoVictorCSousa/workshop-springboot3-jpa/blob/main/assets/domainInstance.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- 
## Implantação em produção
- Banco de dados: H2 ( Banco de Dados em memória para testes)

## Teste de requisições
- Postman

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/JoaoVictorCSousa/workshop-springboot3-jpa

# entrar na pasta do projeto back end
cd workshop-springboot3-jpa

# executar o projeto
./mvnw spring-boot:run
```

# Autor

João Victor Carvalho de Sousa

https://www.linkedin.com/in/joaovicarvalho/
