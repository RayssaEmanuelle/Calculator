﻿# README: Calculadora em Java 🧮
Descrição do Projeto
Este projeto é uma aplicação simples de calculadora desenvolvida em Java. Ele permite ao usuário realizar operações matemáticas básicas como soma, subtração, multiplicação e divisão. A interface é interativa e permite ao usuário realizar múltiplas operações até que ele decida encerrar o programa.

Funcionalidades
Realização de Operações Matemáticas Básicas:

Soma (+)
Subtração (-)
Multiplicação (*)
Divisão (/), com verificação de divisão por zero.
Execução Contínua:

Após a conclusão de cada operação, o usuário pode optar por realizar uma nova operação ou encerrar a aplicação.
Validação de Operações:

O programa verifica se a operação inserida pelo usuário é válida e oferece feedback em caso de erro.
Como Usar
Compilar e Executar o Código:

Clone o repositório ou faça o download do arquivo Java.
Compile o arquivo CalculadoraApp.java utilizando o compilador Java.

Copiar código
javac CalculadoraApp.java
Execute a aplicação compilada.

Copiar código
java CalculadoraApp
Interação com o Usuário:

O programa solicitará que você insira o primeiro número.
Em seguida, você escolherá a operação desejada: soma, subtração, multiplicação ou divisão.
Por fim, você deverá inserir o segundo número e o programa calculará o resultado.
Após cada operação, será perguntado se deseja realizar uma nova operação. Se sim, o ciclo continuará; caso contrário, o programa será encerrado.
Exemplo de Execução:

Copiar código
Digite o primeiro valor: 
10
Digite a operação (+, -, /, *): 
+
Digite o segundo valor: 
5
Resultado: 15.0
Deseja realizar uma nova operação? (S/N) 
S

Digite o primeiro valor: 
15
Digite a operação (+, -, /, *): 
/
Digite o segundo valor: 
0
Erro: divisão por zero não permitida.
Resultado: 0.0
Deseja realizar uma nova operação? (S/N) 
N
Estrutura do Código
CalculadoraApp: Classe principal que executa o fluxo da aplicação, gerencia a entrada do usuário e chama as operações matemáticas.

Operações: As operações matemáticas (soma, subtração, multiplicação, divisão) são implementadas utilizando o padrão de design de interfaces (Operacao), que permite a criação de diferentes operações de forma flexível.

Operacao: Interface que define o método calcular que é implementado nas classes Soma, Subtracao, Multiplicacao e Divisao.

Operacaof: Classe responsável por criar e retornar a operação correta com base na entrada do usuário.

Estrutura do Projeto

Copiar código
src/
├── CalculadoraApp.java      # Classe principal para execução da calculadora
├── Calculadora.java         # Lógica de execução da calculadora
├── Operacao.java            # Interface para operações matemáticas
├── Soma.java                # Implementação da soma
├── Subtracao.java           # Implementação da subtração
├── Divisao.java             # Implementação da divisão
├── Multiplicacao.java       # Implementação da multiplicação
├── Operacaof.java           # Fábrica para criar as operações
Como Contribuir
Se você deseja contribuir com este projeto, siga os passos abaixo:

Faça um fork deste repositório.

Crie um branch para a sua feature:


Copiar código
git checkout -b minha-feature
Realize as modificações necessárias e adicione um commit:


Copiar código
git commit -m "Adiciona nova funcionalidade"
Envie as mudanças para o repositório remoto:


Copiar código
git push origin minha-feature
Crie um Pull Request para que possamos revisar e, possivelmente, integrar sua contribuição.
