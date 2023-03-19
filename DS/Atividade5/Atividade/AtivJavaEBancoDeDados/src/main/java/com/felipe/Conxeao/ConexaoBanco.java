package com.felipe.Conxeao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.nio.file.*;



public class ConexaoBanco
{
   
    //metodo: Construtor
    public ConexaoBanco()
    {
        
    }
    
    public Connection connect()
    {
        String path = System.getProperty("user.dir");
        String nomeBanco = "banco_teste.db";
        String url = "jdbc:sqlite:" + path + "\\banco\\" + nomeBanco;
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(url);
            DatabaseMetaData meta = conn.getMetaData();
            JOptionPane.showMessageDialog(null, "O nome do driver de conexão é: " + meta.getDriverName());
            
            if (conn != null)
            {
                JOptionPane.showMessageDialog(null, "Conexão com o banco de dados estabelecida!");
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null , e.getMessage());
        }
        return conn;
    }
    
    public void createNewDatabase(String nomeBanco){
        
        String path = System.getProperty("user.dir");
        String url = "jdbc:sqlite:" + path + "\\banco\\" + nomeBanco;
        
        try (Connection conn = DriverManager.getConnection(url)){
            
            if (conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                JOptionPane.showMessageDialog(null, "Uma nova base de dados foi criada com sucesso!");
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null , e.getMessage());
        }
    }
    
    public void createNewTable(){
        String path = System.getProperty("user.dir");
        String nomeBanco = "banco_teste.db";
        String url = "jdbc:sqlite:" + path + "\\banco\\" + nomeBanco;
        String sql = "CREATE TABLE IF NOT EXISTS TB_ALUNO (\n"
                    + "     id integer PRIMARY KEY, \n"
                    + "     nome text NOT NULL, \n"
                    + "     peso real\n"
                    + ");";
        try (Connection conn = DriverManager.getConnection(url);
         Statement stmt = conn.createStatement()){
            System.out.println(sql);
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "Uma nova tabela foi inserida com sucesso!");
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void insert(String nome, double peso){
        String path = System.getProperty("user.dir");
        String nomeBanco = "banco_teste.db";
        String url = "jdbc:sqlite:" + path + "\\banco\\" + nomeBanco;
        String sql = "INSERT INTO TB_ALUNO (nome, peso) VALUES(? , ?)";
        
        try (Connection conn = DriverManager.getConnection(url);
        PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, nome);
            pstmt.setDouble(2, peso);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados inseridos na tabela!");
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void deleteDataBase(String nomeBanco) {
        String path = System.getProperty("user.dir");
        Path Path = Paths.get(path+"\\Banco\\"+nomeBanco);

        try {
            Files.delete(Path);
            JOptionPane.showMessageDialog(null, "O banco de dados" + nomeBanco + "foi deletado com sucesso!");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void deleteCadastro(String nomeBanco, int Id){
        String path = System.getProperty("user.dir");
        String url = "jdbc:sqlite:" + path + "\\banco\\" + nomeBanco;
        String sql = "DELETE FROM TB_ALUNO WHERE Id = ?;";
        
        try (Connection conn = DriverManager.getConnection(url);
        
        PreparedStatement pstmt = conn.prepareStatement(sql)){
            
            pstmt.setInt(1, Id);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dado deletado com sucesso!");
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void deleteTable(String nomeBanco){
        String path = System.getProperty("user.dir");
        String url = "jdbc:sqlite:" + path + "\\banco\\" + nomeBanco;
        String sql = "DROP TABLE TB_ALUNO";

        try (Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement()){
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "A tabela foi deletado com sucesso!");
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }      
    }
    
    public void selectAll(){
        String path = System.getProperty("user.dir");
        String nomeBanco = "banco_teste.db";
        String url = "jdbc:sqlite:" + path + "\\banco\\" + nomeBanco;
        String sql = "SELECT id, nome, peso FROM TB_ALUNO";
        
        try (Connection conn = DriverManager.getConnection(url);
        
        Statement stmt = conn.createStatement();
                
        ResultSet rs = stmt.executeQuery(sql)){
            String lista = "";
            
            while (rs.next()){
                lista = lista + rs.getInt("id") + " , " + rs.getString("nome") + " , " + rs.getDouble("peso") + "\n";
            }
            
            JOptionPane.showMessageDialog(null, "Dados da tabela TB_ALUNOS\n\n" + lista);
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void update(int id, String nome, double peso){
        String path = System.getProperty("user.dir");
        String nomeBanco = "banco_teste.db";
        String url = "jdbc:sqlite:" + path + "\\banco\\" + nomeBanco;
        String sql = "UPDATE TB_ALUNO SET nome = ? , peso = ? WHERE id = ?;";
        
        try (Connection conn = DriverManager.getConnection(url);
        PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, nome);
            pstmt.setDouble(2, peso);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados atualizados na tabela!");
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
