# DynamicCheckboxes
Este é um backEnd que faz o gerenciamento de checkboxes dinâmicos de um front em angular.

Contém um database H2 em memória com duas tabelas: "checkboxes disponíveis" e "checkboxes marcados", a tabela de marcados já recebe uma string no formato "optionA:optionB:optionC" para o persist na tabela.

Collections estão disponíveis para testes no Postman em /Collections.



## 🛠 Tecnologias
- Java 11
- SpringBoot 2.7.18
- SpringData JPA
- H2 database 2.2.220
- Lombook
- Arquitetura Hexagonal
- FrontEnd Angular https://github.com/V1centR/DynamicCheckboxesFront


## Instalação

Faça o clone do repositório e dentro da pasta DynamicCheckboxes execute o comando:

```bash
  mvn install
```

Após terminado a execução do install execute:

```bash
  mvn spring-boot:run
```

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/vicent-ramos-33954ab5/)


