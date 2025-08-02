# Desafio Controle Fluxo
- Este projeto é um desafio de programação em Java focado em **controle de fluxo, tratamento de exceções e interação com o terminal**. O objetivo é simular um contador que imprime números incrementados dentro de um determinado intervalo.

## 🚀 Funcionalidades
O programa recebe dois parâmetros inteiros via terminal e executa a seguinte lógica:

1- **Valida os Parâmetros**: Verifica se o segundo número é maior que o primeiro.

2- **Lança Exceção**: Se a validação falhar (o primeiro número for maior que o segundo), uma exceção customizada (ParametrosInvalidosException) é lançada.

3- **Executa a Contagem**: Se os parâmetros forem válidos, o programa realiza um loop (for) com base na diferença entre os dois números e imprime a contagem no console.

### Exemplo de Uso
- **Entrada Válida**: Se você passar os números 12 e 30, o programa imprimirá a contagem de 1 a 18.

- **Entrada Inválida**: Se você passar os números 30 e 12, o programa lançará uma exceção e exibirá a mensagem: "O segundo parâmetro deve ser maior que o primeiro".

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.

- **Scanner**: Classe utilizada para ler a entrada do usuário no terminal.

## 📁 Estrutura do Projeto

O projeto é composto por duas classes principais:

    Contador.java: Contém a lógica principal do programa, incluindo os métodos main e contar, que processam a entrada e a contagem.

    ParametrosInvalidosException.java: Uma classe de exceção customizada que herda de Exception, usada para tratar a regra de negócio do programa.

## ⚙️ Como Executar
Para executar o projeto, siga os passos abaixo:

1- Clone o Repositório (se estiver em um, caso contrário, apenas compile os arquivos).

2- Compile os arquivos Java:

**javac Contador.java ParametrosInvalidosException.java**

3- Execute o programa:

**java Contador**

4- O terminal solicitará a entrada dos dois números. Digite-os e pressione Enter após cada um.


