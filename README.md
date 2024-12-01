# caixa_branca

## Resumo dos erros

Vulnerabilidade à injeção de SQL:
Concatenar diretamente variáveis na consulta SQL permite que usuários mal-intencionados executem comandos no banco de dados, comprometendo sua segurança.

Falta de tratamento adequado de exceções:
Blocos catch vazios ignoram erros, tornando difícil identificar e corrigir problemas quando algo dá errado.

Driver JDBC desatualizado ou incorreto:
O driver usado para conectar ao banco de dados pode estar errado ou obsoleto, resultando em falha na conexão.

Exposição de credenciais sensíveis no código:
Nome de usuário e senha do banco estão no código, o que facilita o acesso não autorizado se o código for compartilhado.

Conexões não fechadas, causando possíveis vazamentos:
A falta de fechamento da conexão com o banco pode esgotar os recursos disponíveis e causar problemas de desempenho.


# Caixa Branca (Estático)

![a](https://github.com/user-attachments/assets/f99d1c55-70eb-4f36-9d6b-a5b69dc18ae6)


