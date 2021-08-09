/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansAgenda;
import modeloConection.ConexaoBD;

/**
 *
 * @author Gabriel
 */
public class DaoAgenda {
    BeansAgenda agenda = new BeansAgenda();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexCliente = new ConexaoBD();
    ConexaoBD conexTatuador = new ConexaoBD();
    
    int codTat;
    int codCli;
    
    public void Salvar(BeansAgenda agenda){
        BuscarTatuador(agenda.getNomeTatu());
        BuscarCliente(agenda.getNomeCli());
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into agenda(agenda_codcli, agenda_codtatuador, agenda_motivo, agenda_data, agenda_status) values (?,?,?,?,?)");
            pst.setInt(1, codCli);
            pst.setInt(2, codTat);
            pst.setString(3, agenda.getObserva());
            pst.setDate(4, new java.sql.Date(agenda.getData().getTime()));
            pst.setString(5, agenda.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar agendamento" + ex);
        }
        
        conex.desconecta();
    }
    
    public void BuscarTatuador(String nomeTatuador){
        conexTatuador.getConnection();
        conexTatuador.executaSql("select *from tatuadores where nome_tatuador='"+nomeTatuador+"'");
        try {
            conexTatuador.rs.first();
            codTat= conexTatuador.rs.getInt("cod_tatuador");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tatuador não cadastrado");
        }
    }
    
    public int BuscarCodTatuador(String nomeTatuador){
        conexTatuador.getConnection();
        conexTatuador.executaSql("select *from tatuadores where nome_tatuador='"+nomeTatuador+"'");
        try {
            conexTatuador.rs.first();
            codTat= conexTatuador.rs.getInt("cod_tatuador");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tatuador não cadastrado");
        }
        return codTat;
    }
    
    public void BuscarCliente(String nomeCliente){
        conexCliente.getConnection();
        conexCliente.executaSql("select *from cliente where cli_nome='"+nomeCliente+"'");
        try {
            conexCliente.rs.first();
            codCli= conexCliente.rs.getInt("cli_codigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
        }
    }
    
    public void BuscarAgendamento(BeansAgenda agenda){
        conexTatuador.getConnection();
        conexTatuador.executaSql("select *from agenda where agenda_data='="+agenda.getData()+"'");
        try{
            conexTatuador.rs.first();
            codTat= conexTatuador.rs.getInt("cod_tatuador");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Tatuador não encontrado");
        }
        
    }
    
    public void Alterar(BeansAgenda agenda){
        conex.getConnection();
        try {
            PreparedStatement pst;
            pst = conex.con.prepareStatement("update agenda set agenda_status=? where agenda_cod=?");
            pst.setString(1,agenda.getStatus());
            pst.setInt(2, agenda.getAgendaCod());
            
            pst.execute(); 
            
            JOptionPane.showMessageDialog(null,"Agendamento em andamento");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro no agendamento"+ex);
        }
        
        conex.desconecta();
    }
    
    public BeansAgenda BuscarAgendaPorCodigo(int cod){
        BeansAgenda agen = new BeansAgenda();
        
        conex.getConnection();
        conex.executaSql("select *from agenda inner join cliente on agenda_codcli=cli_codigo inner join tatuadores on agenda_codtatuador=cod_tatuador where agenda_cod='"+cod+"'");
        
        try{
            conex.rs.first();
            agen.setNomeCli(conex.rs.getString("cli_nome"));
            agen.setNomeTatu(conex.rs.getString("nome_tatuador"));
            agen.setObserva(conex.rs.getString("agenda_motivo"));
            agen.setClienteNasc(conex.rs.getString("cli_nasc"));
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar agendamento por código"+ex);
        }
        return agen;
    }
    
    
}
