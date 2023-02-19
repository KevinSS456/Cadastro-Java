
package DAO;

import Model.Usuario;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UsuarioDAOCD {
    
    Connection conncection;
    PreparedStatement st;
    ResultSet rs;
    Usuario  Usuario = new Usuario();
    
    public UsuarioDAOCD(){
        this.conncection = new ConnectionFactory().getConnection();
    }
    public void Adicionar(Usuario usuario) throws SQLException{
        
        try{
            String sql = "insert into aluno"+
                    "(Nome, CPF, CEP, RM, Email, Idade, Sexo, Senha)"+
                    "values (?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = conncection.prepareStatement(sql);
            
            stmt.setString(1,usuario.getNome());
            stmt.setString(2,usuario.getCPF());
            stmt.setString(3,usuario.getCEP());
            stmt.setString(4,usuario.getRM());
            stmt.setString(5,usuario.getEmail());
            stmt.setString(6,usuario.getIdade());
            stmt.setString(7,usuario.getSexo());
            stmt.setString(8,usuario.getSenha());
            
            
            stmt.execute();
            stmt.close();
        }
        catch(SQLException e){
            System.out.println("Erro: "+e);
        }
        finally{
            conncection.close();
        }
        
    }
    
    public Usuario Consultar(String Email) {
          
      try{
          st = conncection.prepareStatement("SELECT * FROM aluno WHERE email = ?");
          st.setString(1, Email);
          rs = st.executeQuery();
          if(rs.next()){
          Usuario.setEmail(rs.getString("Email"));
          Usuario.setRM(rs.getString("RM"));
          Usuario.setSexo(rs.getString("Sexo"));
          Usuario.setIdade(rs.getString("Idade"));
          Usuario.setNome(rs.getString("Nome"));
          return Usuario;}
          else{
                System.out.println("O erro ta aqui");
                return  null;
          }
      }
      catch(SQLException e){
          System.out.println("Não encontrou");
          return null;   
        }
    }
    
}

