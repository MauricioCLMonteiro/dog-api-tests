# 🐶 Dog API - Testes Automatizados

## 🎯 Objetivo
Validar o comportamento dos endpoints públicos da Dog API utilizando testes automatizados com Java, JUnit 5 e RestAssured.

## 🚀 Endpoints testados
- GET /breeds/list/all
- GET /breed/{breed}/images
- GET /breeds/image/random

## 🧰 Tecnologias
- Java 17
- Maven
- RestAssured
- JUnit 5
- Allure (para relatório)

## ⚙️ Configuração do ambiente

1. Clone o repositório:
   ```bash
   git clone https://github.com/MauricioCLMonteiro/dog-api-tests.git
   ```
2. Entre no diretório:
   ```bash
   cd dog-api-tests
   ```
3. Execute os testes:
   ```bash
   mvn test
   ```
4. (Opcional) Gere o relatório Allure:
   ```bash
   allure serve target/allure-results
   ```

## ✅ Resultados Esperados
| Endpoint | Resultado | Validações principais |
|-----------|------------|----------------------|
| `/breeds/list/all` | 200 OK | Status = success, lista de raças |
| `/breed/{breed}/images` | 200 OK | URLs de imagens da raça |
| `/breeds/image/random` | 200 OK | Retorna URL de imagem |
