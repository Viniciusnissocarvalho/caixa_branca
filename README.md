# Projeto de Teste de Caixa Branca e Documentação de Código

Este repositório contém um código de exemplo que realiza a verificação de usuários em um banco de dados MySQL. Através deste

projeto, foram realizadas várias etapas de análise e melhoria do código utilizando a abordagem de Teste de Caixa Branca. Além 

disso, este repositório inclui documentação do código e análise estática, juntamente com o preenchimento de formulários 

relacionados ao teste.

# Objetivo

O objetivo principal deste projeto é realizar uma análise completa de um código Java que interage com um banco de dados MySQL. 

As etapas incluem:

Análise Estática do Código:

Identificação de erros potenciais no código.

# Teste de Caixa Branca:

Criação de um fluxo de grafo para análise de controle de fluxo.

Cálculo da complexidade ciclomática do código.

Identificação dos caminhos básicos possíveis dentro do código.

Documentação do Código:

Comentários explicativos no código usando Javadoc.

Explicações detalhadas sobre as classes, métodos e variáveis do código.

# Estrutura do Repositório

## Este repositório contém os seguintes arquivos e pastas:

src/: Código-fonte Java com a implementação da classe User que realiza a verificação de usuários no banco de dados.

Plano de Teste (XLS): Formulário preenchido com os testes estáticos realizados.

Grafos e Complexidade: Arquivo com o gráfico de fluxo, cálculo da complexidade ciclomática e identificação dos caminhos.

Javadoc: Documentação gerada automaticamente com base no código-fonte.

# Etapas Realizadas

## ETAPA 1: Teste de Caixa Branca (Estático)

Na primeira etapa, o código foi analisado estáticamente para identificar potenciais falhas, como:

Vulnerabilidades de injeção de SQL.

Falta de tratamento adequado de exceções.

Exposição de credenciais no código.

Possíveis vazamentos de conexão com o banco de dados.

## ETAPA 2: Preenchimento do Formulário de Teste Estático

Após a análise estática, o formulário PLANO DE TESTE foi preenchido com as observações feitas no código e as correções 

sugeridas. Este arquivo pode ser consultado na pasta PLANO DE TESTE.

## ETAPA 3: Critérios de Caixa Branca

Na terceira etapa, foi realizado um gráfico de fluxo para visualizar o controle de execução do código. Além disso, foi

calculada a complexidade ciclomática, que mede a quantidade de caminhos independentes dentro do código. A quantidade de 

caminhos e a análise de seus fluxos também foi documentada.

## ETAPA 4: Documentação do Código

O código foi devidamente comentado com Javadoc para explicar o funcionamento das classes, métodos e variáveis. Isso facilita o 

entendimento e manutenção do código no futuro.




