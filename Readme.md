# Sistema de Login e Validação em Java

Projeto desenvolvido para treinar conceitos avançados de Orientação a Objetos (POO), modularização de código, separação de responsabilidades em camadas e validação de dados de entrada em Java.

## 🚀 Sobre o Projeto
O sistema coleta dados cadastrais de um usuário (CPF, nome e telefone) através do console, realiza validações rigorosas de regras de negócios para cada um dos campos e exibe um resumo final dos dados se tudo estiver correto.

## 📂 Estrutura do Projeto
O projeto está dividido em três classes principais para garantir a separação de responsabilidades:

1. **`Main.java`**: Ponto de entrada da aplicação. Orquestra o fluxo de execução chamando o cadastro e as validações.
2. **`login.java`**: Responsável pela entidade de usuário. Gerencia a coleta de dados via `Scanner` e a exibição do status dos dados cadastrados.
3. **`validador.java`**: Camada dedicada exclusivamente à lógica de regras de negócio e validação:
    - **CPF**: Validação matemática completa dos dois dígitos verificadores (pesos e módulos).
    - **Nome**: Validação de comprimento por restrições de tamanho mínimo e máximo.
    - **Telefone**: Validação de formatação e tamanho de caracteres.

## 🛠️ Tecnologias Utilizadas
- **Java (JDK)**
- **IntelliJ IDEA Ultimate**
- **Git & GitHub**

## 💻 Como Executar
1. Certifique-se de ter o **Java JDK** instalado na sua máquina.
2. Baixe ou clone este repositório.
3. Abra a pasta do projeto no seu editor Java de preferência (como o **IntelliJ IDEA**).
4. Certifique-se de que os arquivos `Main.java`, `login.java` e `validador.java` estão na mesma pasta (`src`).
5. Execute a classe `Main.java`.