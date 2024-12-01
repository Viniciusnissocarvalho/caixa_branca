package br.com.projeto.grafo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Grafo {
    /**
     * Método conectarBD()
     * Responsável por estabelecer uma conexão com o banco de dados MySQL.
     * - Usa o DriverManager para se conectar a um banco local (127.0.0.1).
     * - Retorna um objeto Connection para interagir com o banco.
     * - Em caso de erro, retorna null.
     */
    public Connection conectarBD() {
        Connection conn = null; // Inicializa a conexão como nula.
        try {
            
            Class.forName("com.mysql.DriverManager").newInstance(); // Carrega a classe do Driver JDBC e cria uma instância dela.
            
            
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";// URL de conexão com o banco de dados (inclui login e senha no código).
            
            
            conn = DriverManager.getConnection(url);// Tenta estabelecer a conexão.
        } catch (Exception e) {                     // Exceções são capturadas, mas não há um tratamento adequado (log ou mensagem).
            
        }
        return conn; // Retorna a conexão estabelecida ou null caso ocorra falha.
    }

                                      // Variáveis de classe para armazenar o nome do usuário e o resultado da verificação.
    public String nome = "";          // Armazena o nome do usuário caso seja encontrado no banco.
    public boolean result = false;    // Indica se a verificação foi bem-sucedida (true) ou não (false).

    /**
     * Método verificarUsuario(String login, String senha)
     * Realiza a verificação de credenciais no banco de dados.
     * - Monta uma consulta SQL com as credenciais fornecidas.
     * - Tenta buscar o usuário no banco de dados.
     * - Atualiza as variáveis 'nome' e 'result' com os resultados da consulta.
     * - Retorna true se as credenciais forem válidas; caso contrário, false.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";                // Inicializa a string SQL.
        Connection conn = conectarBD(); // Chama o método conectarBD() para obter a conexão.
        
        
        sql = "select nome from usuarios "; // Monta a consulta SQL com as credenciais do usuário.
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "'";

        try {
           
            Statement st = conn.createStatement(); // Cria um Statement para executar a consulta SQL.
            
           
            ResultSet rs = st.executeQuery(sql);  // Executa a consulta SQL e obtém os resultados em um ResultSet.
            
           
            if (rs.next()) {					 // Verifica se há resultados (usuário encontrado).
                nome = rs.getString("nome");     // Armazena o nome do usuário.
                result = true;                   // Indica que as credenciais são válidas.
            }
        } catch (Exception e) {					// Exceções são capturadas, mas não há um tratamento adequado.
            
        }
        return result; // Retorna true ou false baseado na verificação.
    }
}
