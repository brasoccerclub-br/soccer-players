# SOCCER PLAYERS
REST API básica de gerenciamento de jogadores de futebol

Para o desenvolvimento do projeto, foram necessárias a utilização de algumas ferramentas, como o Astah, Spring Boot e outros.

A seguir está a arquitetura utilizada no projeto:
* Spring Boot
* Postman
* Banco de dados H2
* Swagger
* API REST

Também fizemos uso do Cloud OAuth2, que tem a função de fazer a autenticação do user e a autorização de acesso ao sistema.

# Funcionalidades

**Cadastramento**

* Administradores fazem cadastro de:
  * Cadastro de Administradores
  * Cadastro de usuários
  * Cadastro de novas tabelas

* Usuários fazem cadastro de:
  * Cadastro de Jogadores
	* Cadastro de Nome Jogador
	* Cadastro de Número
	* Cadastro de Data Nascimento
	* Cadastro de Time
	* Cadastro de Posição
  * Cadastro de Times
	* Cadastro de Nome Time
	* Cadastro de Número
	* Cadastro de Cidade
	* Cadastro de Estado
  * Cadastro de Posição
	* Cadastro de Nome da posição
	* Cadastro de Área da posição

**Consulta**
* O usuário pode consultar todas as informações das tabelas de Jogadores, Times e Posição.

**Observações**
* Senha do usuário admin: admin1234
* Utilizar o endpoint /oauth/token para realizar login e receber o token de acesso.
* Acessar documentação da API - Swagger: localhost:8080/swagger-ui.html

# Futuras Ferramentas

   * Conexões com outros serviços.
   * Conexão com serviços Mobile e Websites.
   * Conexão com ferramentas e serviços locais. 
   * Criação de testes Automatizados.
   * Utilização de Banco de Dados e outras ferramentas na nuvem e serviços como Docker e Jenkins para DevOps.
