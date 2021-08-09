/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansTatuadores;

/**
 *
 * @author Gabriel
 */
public class DaoTatuador {
   
    ConexaoBD conex = new ConexaoBD();
    BeansTatuadores mod = new BeansTatuadores();
    
    public void Salvar(BeansTatuadores mod){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tatuadores (nome_tatuador, especialidade_tatuador, tempo_profissao) values(?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecialidade());
            pst.setString(3, mod.getTempoProfissao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso:");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados:\nErro:"+ex);
        }
        
        conex.desconecta();
    }
    
    public void editar(BeansTatuadores mod){
        try {
            conex.getConnection();
            PreparedStatement pst = conex.con.prepareStatement("update tatuadores set nome_tatuador=?, especialidade_tatuador=?, tempo_profissao=? where cod_tatuador=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecialidade());
            pst.setString(3, mod.getTempoProfissao());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
           
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados\nErro:"+ex);
        }
         conex.desconecta();
    }
    
    public void excluir(BeansTatuadores mod){
        try {
            conex.getConnection();
            PreparedStatement pst = conex.con.prepareStatement("delete from tatuadores where cod_tatuador=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados exlcuídos com sucesso\n");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir dados\nErro:" +ex);
        }
        conex.desconecta();
    }
    
    
    public BeansTatuadores buscaTatuadores(BeansTatuadores mod){
        conex.getConnection();
        conex.executaSql("Select * from tatuadores where nome_tatuador like '%" + mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_tatuador"));
            mod.setNome(conex.rs.getString("nome_tatuador"));
            mod.setEspecialidade(conex.rs.getString("especialidade_tatuador"));
            mod.setTempoProfissao(conex.rs.getString("tempo_profissao"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tatuador não cadastrado\n"+ex);
        }
        
        conex.desconecta();
        
        return mod;
    }
    
    
    
}
