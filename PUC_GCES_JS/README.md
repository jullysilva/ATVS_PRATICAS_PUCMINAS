# Trabalho Individual de Gestao de Configuracao de Software 2023/1
Versao JAVASCRIPT
10 Pontos

## 1 Descricao
Os conhecimentos de Gestao de Configuracao de Software sao fundamentais no ciclo de vida de um produto de software. As t ́ecnicas para a gestao vao desde o controle de versao, automacao de build e de configuracao de ambiente, testes automatizados, isolamento do ambiente ate o deploy do sistema. Este ciclo sao atualmente integrados em um pipeline de DevOps com as etapas de Integracao Contınua (CI) e Deploy Contınuo (CD) implementadas e automatizada.
Para exercitar estes conhecimentos, neste trabalho, voce dever ́a aplicar os conceitos estudados ao longo da disciplina no produto de software contido neste repositorio (PUC-GCES-JS).
O sistema se trata de uma aplicacao em Django e React que gerencia uma biblioteca. Para executar a aplicacao em sua m ́aquina, basta seguir o passo-a-passo descrito nas pastas do Backend e Frontend arquivo. Link do projeto: PUC-GCES-JS

## 2 Sobre a Aplicacao
A aplicacao ́e um simples sistema de gerenciamento de uma biblioteca. Porem, o foco do trabalho ́e na automacao da build, testes, conteinerizacao e configuracao dos pipelines de CI/CD.

## 3 Etapas do Trabalho
O trabalho deve ser elaborado por etapas. Cada uma das etapas deve ser realizada em um commit separado com o resultado funcional desta etapa. As etapas de 1 a 3 (VEJA A TABELA 1) sao relacionadas ao isolamento do ambiente utilizando a ferramenta Docker e Docker Compose. Neste sentido o tutorial abaixo cobre os conceitos fundamentais para o uso destas tecnologias.


### 3.1 Tutoriais
As etapas de 4 a 6 (VEJA A TABELA 1) sao relacionadas a configuracao do pipeline de CI e CD.

## 4 Containerizacao do Banco
A versao inicial do sistema contem uma aplicacao Django no backend cujo funcionamento requer uma instalacao de um banco de dados Postgres. A primeira etapa do trabalho ́e de configurar um container somente para o banco de dados com as credenciais especificadas na descricao da aplicacao e testar o funcionamento do mesmo.

## 5 Containerizacao da aplicacao + banco
Nesta segunda etapa, tanto o backend quanto o banco de dados deverao estar funcionando em containers individuais. Devera ser utilizado um orquestrador (Docker Compose) para gerenciar comunicacao entre os containers alem do uso de credenciais, networks, volumes, entre outras configuracoes necessarias para a correta execucao da aplicacao.

## 6 Configuracao do Frontend
A terceira etapa do trabalho consiste em dockerizar o frontend que ́e uma aplicacao em React seguindo as instrucoes do README e incluindo a mesma no Docker Compose.

## 7 Servindo a aplicacao com o Nginx
A  ́ultima etapa de configuracao do ambiente ́e a de servir a aplicacao atraves do Nginx. Neste caso, sera necessario configurar o Nginx em um container e adiciona-lo ao Docker Compose.

## 8 Integracao Contınua (CI)
Para a realizacao desta etapa, a aplicacao ja devera ter seu ambiente completamente containerizado. Devera ser utilizada uma ferramenta de Integracao Contınua para garantir o build, os testes e os deploy para o Docker Hub dos servicos principais. Esta etapa do trabalho podera ser realizada utilizado os ambientes de CI do GitLab-CI ou Github Actions.
Requisitos da configuracao da Integracao Contınua (Gitlab ou Github) incluem:

- Build
- Test
- Lint

## 9 Deploy Contınuo (CD)
A etapa final do trabalho devera ser realizada a partir do deploy automatico da aplicacao que deve ser realizado apos passar sem erros em todas as etapas de CI.
