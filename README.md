# Código com pontos numerados

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

public class User {

public Connection conectarBD() {
    
        Connection conn = null;
        
        try {
        
4         Class.forName("com.mysql.DriverManager").newInstance();

            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            
            conn = DriverManager.getConnection(url);
            
6        } catch (Exception e) {

        }
    
5        return conn;
    }

    public String nome = "";
    
    public boolean result = false;

 1   public boolean verificarUsuario(String login, String senha) {
 
 2       String sql = "";
 
 3       Connection conn = conectarBD();
 
        sql = "select nome from usuarios ";
        
        sql += "where login = '" + login + "'";
        
        sql += " and senha = '" + senha + "'";
        
        try {
        
 7           Statement st = conn.createStatement();
 
            ResultSet rs = st.executeQuery(sql);
            
 8           if (rs.next()) {
 
 9               nome = rs.getString("nome");
 
 10               result = true;
 
            }
            
 12       } catch (Exception e) {
 
        }
        
 11       return result;
 
    }
    
}




