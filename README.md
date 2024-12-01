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

Uso inseguro de Statement:
Usar Statement ao invés de PreparedStatement aumenta o risco de injeção de SQL e reduz a eficiência da execução de consultas.

Falta de logs e rastreamento de erros:
Não registrar mensagens de erro dificulta o diagnóstico e a manutenção, especialmente em sistemas complexos.



