# Baozi Store — API REST

## Sobre o projeto

Este projeto foi desenvolvido como atividade prática da disciplina de Desenvolvimento Web Back-End. O objetivo é criar uma API REST para a Baozi Store, uma loja fictícia de pãezinhos chineses, permitindo o gerenciamento de clientes, produtos e pedidos.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Postman

## Funcionalidades

A API permite realizar operações de cadastro, consulta, listagem e exclusão de registros das seguintes entidades:

- **Cliente:** cadastro e consulta de clientes.
- **Produto:** cadastro e consulta de produtos.
- **Pedido:** registro de pedidos, relacionando clientes, produtos e quantidades compradas.

## Estrutura do projeto

O projeto utiliza a arquitetura MVC do Spring, com separação das responsabilidades em pacotes:

- `model`: representação das entidades.
- `repository`: acesso e persistência dos dados.
- `controller`: implementação dos endpoints da API REST.

## Testes

Os endpoints foram testados utilizando o Postman, verificando o funcionamento das requisições HTTP e o retorno dos dados em formato JSON.

## Objetivo acadêmico

O projeto tem como finalidade aplicar conceitos de desenvolvimento de APIs REST, persistência de dados em banco relacional, operações CRUD e organização de aplicações back-end com Spring Boot.
