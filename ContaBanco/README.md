# Projeto Conta Bancária

Este projeto Java é uma simulação simples de criação de conta bancária via terminal. Ele foi desenvolvido para exercitar conceitos básicos de sintaxe Java, como declaração de variáveis, entrada e saída de dados via Scanner, e concatenação de Strings.

## Funcionalidades
O programa permite ao usuário inserir as seguintes informações para uma nova conta bancária:

- Número da Conta: Um número inteiro.
- Número da Agência: Uma sequência de texto (ex: "067-8").
- Nome do Cliente: O nome completo do titular da conta.
- Saldo Inicial: Um valor decimal que será o saldo disponível na conta.

Após a inserção de todos os dados, o sistema exibe uma mensagem de boas-vindas personalizada com as informações da conta criada.

## Pré-requisitos
Para compilar e executar este projeto, você precisará ter o **Java Development Kit** (JDK) instalado em sua máquina. Recomenda-se o JDK 8 ou superior.

## Interagindo com o programa
Ao executar o programa, ele solicitará as informações da conta passo a passo. Digite os dados e pressione Enter após cada entrada:
| Mensagem do Programa | Dado Inserido|
|-------------------|-------------------------|
| Por favor, digite o número da Conta! | 1021 |
|Por favor, digite o número da Agência! | 067-8 |
|Por favor, digite o seu Nome Completo! | Mário Andrades |
| Por favor, digite o saldo inicial! | 237.48 |

## Importante sobre Saldo:
O programa espera que o saldo seja digitado usando ponto (.) como separador decimal (ex: 237.48). Se você usar vírgula (,), poderá ocorrer um erro de **InputMismatchException**.

Após inserir todas as informações, o programa exibirá uma mensagem similar a esta:
Olá Mário Andrades, obrigado por criar uma conta em nosso banco!
Sua agência é 067-8, conta 1021 e seu saldo é R$ 237,48.
O saldo já está disponível para saque! Aproveite nossos serviços!
