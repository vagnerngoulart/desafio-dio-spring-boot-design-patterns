# Design Patterns com Spring Boot

## 📌 Sobre o Projeto
Este projeto foi desenvolvido como parte do **Desafio FULL – Padrões de Projeto** da **Digital Innovation One (DIO)**.  
O objetivo é demonstrar, na prática, a aplicação de **Padrões de Projeto (GoF)** utilizando **Java** e **Spring Boot**, explorando conceitos de arquitetura, desacoplamento e boas práticas no desenvolvimento de APIs REST.

A aplicação simula uma **API interna**, expondo endpoints REST simples, servindo como base didática para o entendimento de como os padrões de projeto podem ser aplicados no dia a dia com o Spring Framework.

---

## 🧩 Padrões de Projeto Aplicados

### 🔹 Singleton
- Implementado naturalmente pelo **Spring Framework**, através do gerenciamento de Beans.
- Exemplo: classes anotadas com `@Service` possuem instância única durante o ciclo de vida da aplicação.

### 🔹 Facade
- O **Controller REST** atua como uma fachada, expondo uma interface simples para o cliente.
- Ele abstrai a complexidade das regras de negócio internas, delegando responsabilidades para a camada de serviço.

### 🔹 Strategy (conceitual)
- A estrutura do projeto permite fácil evolução para o uso do padrão Strategy, possibilitando múltiplas regras de negócio intercambiáveis sem alterar o fluxo principal da aplicação.

---

## 🏗️ Arquitetura do Projeto

O projeto segue uma organização em camadas:

- **Controller** → Responsável pela exposição dos endpoints REST
- **Service** → Contém as regras de negócio
- **Model (Domínio)** → Representa as entidades da aplicação

Essa separação promove **baixo acoplamento**, **alta coesão** e facilita a manutenção e evolução do sistema.

---

## 🚀 Tecnologias Utilizadas
- Java
- Spring Boot
- Maven
- REST API

---

## ▶️ Como Executar o Projeto

### Pré-requisitos
- Java 17 ou superior
- Maven
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)

### Passos
```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Entrar no diretório do projeto
cd projeto-design-patterns

# Executar a aplicação
mvn spring-boot:run


