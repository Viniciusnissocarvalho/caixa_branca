# Código numerado



public class User {

3   public Connection conectarBD() {
       
        Connection conn = null;
        
        try {
           
           Class.forName("com.mysql.DriverManager").newInstance();
           
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            
            conn = DriverManager.getConnection(url);
            
5       } catch (Exception e) {

        }
        
6        return conn;

    }

    public String nome = "";
    
    public boolean result = false;

 1   public boolean verificarUsuario(String login, String senha) {
 
        String sql = "";
        
        Connection conn = conectarBD();
        
 2      sql = "select nome from usuarios ";
 
        sql += "where login = '" + login + "'";
        
        sql += " and senha = '" + senha + "'";
        
        try {
        
 4          Statement st = conn.createStatement();
 
 7           ResultSet rs = st.executeQuery(sql);
 
 8          if (rs.next()) {
 
 9             nome = rs.getString("nome");
 
 10            result = true;
 
            }
            
 11       } catch (Exception e) {
 
        }
        
 12     return result;
 
    }
    
}



# 1. Grafo de fluxo e seus caminhos

![Grafo(3)](https://github.com/user-attachments/assets/247b0e3a-37a1-4cef-9937-f1a372eadfb3)


# 2. Complexidade Ciclomática

𝑉=𝐸−𝑁+2

Onde:

E = Número de arestas (linhas): 14.

N = Número de nós: 11.

Substituindo:


V=14−11+2=5


