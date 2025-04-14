# Desafio Goomer - Sistema de Gerenciamento de Restaurantes
## Sobre o Projeto
Este projeto é uma API REST desenvolvida como parte do Desafio Goomer para gerenciamento de restaurantes. A aplicação permite cadastrar, listar, atualizar e gerenciar informações sobre restaurantes e seus produtos, utilizando as melhores práticas de desenvolvimento com Spring Boot.
## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Spring MVC**
- **Jakarta EE**
- **Maven**
- **Banco de Dados Relacional**

## Funcionalidades Principais
### Restaurantes
- Listagem completa de restaurantes com paginação
- Listagem simplificada de restaurantes com informações mínimas
- Cadastro de novos restaurantes
- Atualização de dados de restaurantes existentes

### Produtos
- Gerenciamento de produtos associados aos restaurantes
- Suporte para promoções e preços especiais

## Estrutura do Projeto
O projeto segue a arquitetura em camadas:
- **Controllers**: Responsáveis por receber requisições HTTP e delegar para os serviços apropriados
- **Services**: Contêm as regras de negócio e lógica da aplicação
- **Repositories**: Gerenciam o acesso e persistência de dados
- **DTOs**: Objetos de transferência de dados para comunicação entre camadas
- **Entities**: Representam as entidades de domínio

## Endpoints da API
### Restaurantes

| Método | Endpoint | Descrição |
| --- | --- | --- |
| GET | `/restaurantes` | Lista todos os restaurantes com informações completas |
| GET | `/restaurantes/min` | Lista versão simplificada dos restaurantes |
| POST | `/restaurantes` | Cadastra um novo restaurante |
| PUT | `/restaurantes/{id}` | Atualiza informações de um restaurante específico |
## Como Executar o Projeto
1. Clone o repositório:
``` 
   git clone https://github.com/seu-usuario/desafio-goomer.git
```
1. Entre na pasta do projeto:
``` 
   cd desafio-goomer
```
1. Execute o projeto com Maven:
``` 
   ./mvnw spring-boot:run
```
1. A API estará disponível em `http://localhost:8080`

## Exemplos de Uso
### Cadastrar um novo restaurante
``` bash
curl -X POST http://localhost:8080/restaurantes \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Restaurante Exemplo",
    "foto": "https://exemplo.com/foto.jpg",
    "endereco": "Rua Exemplo, 123",
    "horarioFuncionamento": [
      {
        "diaSemana": "SEGUNDA",
        "horaAbertura": "08:00",
        "horaFechamento": "18:00"
      }
    ]
  }'
```
### Listar restaurantes (versão simplificada)
``` bash
curl -X GET http://localhost:8080/restaurantes/min
```
## Considerações Finais
Este projeto foi desenvolvido seguindo boas práticas de programação e padrões de projeto como:
- Arquitetura em camadas
- Utilização de DTOs para transferência de dados
- Separação de responsabilidades
- Injeção de dependências
