/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ConexaoBD {

    
    
    public Statement stm; //responsável pelas pesquisas
    public ResultSet rs; //guarda resultdo das pesquisas
    private static String driver = "org.postgresql.Driver";
    private static String caminho = "jdbc:postgresql://localhost:5432/projetoTattooaria";
    private static String usuario = "postgres";
    private static String senha = "vaclgagi";
    public static Connection con; //responsável pela conexão
    
    public static Connection getConnection(){ //responsável pela conexão com a base de dados
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n" + ex.getMessage());
        }
        return con;
    }
    
    
    
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executaSql()\n" + ex);
        }
    }
    
    public void desconecta(){ //responsável pela desconexão da base de dados 
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "BD desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar o BD:\n" + ex.getMessage());
        }
    }
}
