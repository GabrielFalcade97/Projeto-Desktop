/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansTatuadores;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;

/**
 *
 * @author Gabriel
 */
public class DaoUsuario {
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void Salvar(BeansUsuario mod){
        conex.getConnection();
        try {
            PreparedStatement pst;
            pst = conex.con.prepareStatement("insert into usuarios (usu_nome, usu_senha, usu_tipo) values(?, ?, ?)");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso:");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuário\nErro:"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Alterar(BeansUsuario mod){
        try {
            conex.getConnection();
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set usu_nome=?, usu_senha=?, usu_tipo=? where usu_cod=?");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.setInt(4, mod.getUsuCod());
            pst.execute();
           
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração do usuário\nErro:"+ex);
        }
         conex.desconecta();
    }
    
    public void Excluir(BeansUsuario mod){
        try {
            conex.getConnection();
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where usu_cod=?");
            pst.setInt(1, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso\n");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir usuário\nErro:" +ex);
        }
        conex.desconecta();
    }
    
    public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.getConnection();
        conex.executaSql("Select * from usuarios where usu_nome like '%" + mod.getUsuPesquisar()+"%'");
        try {
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("usu_cod"));
            mod.setUsuNome(conex.rs.getString("usu_nome"));
            mod.setUsuTipo(conex.rs.getString("usu_tipo"));
            mod.setUsuSenha(conex.rs.getString("usu_senha"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Uuário não cadastrado\n");
        }
        
        conex.desconecta();
        
        return mod;
    }
}
