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
import modeloBeans.BeansClientes;
import modeloConection.ConexaoBD;


public class DaoCliente {
    
    
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexBairro = new ConexaoBD();
    String nomeBairro;
    int codBai;
    
    
    public void Salvar(BeansClientes cli){
        buscaBaiCod(cli.getNomeBairro());
        conex.getConnection();
        try {
            PreparedStatement pst;
            pst = conex.con.prepareStatement("insert into cliente (cli_nome,cli_rg,cli_telefone,cli_rua,cli_cep,cli_complemento,cli_baicodigo,cli_nasc) values(?,?,?,?,?,?,?,?)");
            pst.setString(1,cli.getNomeCli());
            pst.setString(2, cli.getRg());
            pst.setString(3, cli.getTelefone());
            pst.setString(4, cli.getRua());
            pst.setString(5, cli.getCep());
            pst.setString(6, cli.getComplemento());
            pst.setInt(7, codBai);
            pst.setString(8, cli.getNasc());
            pst.execute();           
            JOptionPane.showMessageDialog(null,"Cliente salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir cliente"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Alterar(BeansClientes cli){
        buscaBaiCod(cli.getNomeBairro());
        conex.getConnection();
        try {
            PreparedStatement pst;
            pst = conex.con.prepareStatement("update cliente set cli_nome=?, cli_rg=?, cli_telefone=?, cli_rua=? ,cli_cep=? ,cli_complemento=?, cli_baicodigo=?, cli_nasc=? where cli_codigo=?");
            pst.setString(1,cli.getNomeCli());
            pst.setString(2, cli.getRg());
            pst.setString(3, cli.getTelefone());
            pst.setString(4, cli.getRua());
            pst.setString(5, cli.getCep());
            pst.setString(6, cli.getComplemento());
            pst.setInt(7, codBai);
            pst.setString(8, cli.getNasc());
            pst.setInt(9, cli.getCodCli());
            pst.execute(); 
            
            JOptionPane.showMessageDialog(null,"Cliente alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar cliente"+ex);
        }
        
        conex.desconecta();
    }
    
    
    
    
    public void buscaBaiCod(String nome){
        conex.getConnection();
        conex.executaSql("select *from bairro where bainome ='"+nome+"'");
        try {
            conex.rs.first();
            codBai = conex.rs.getInt("baicodigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar bairro" + ex);
        }
        
        conex.desconecta();
    }
    
    public BeansClientes buscaCliente(BeansClientes cli){
        conex.getConnection();
        
        try {
            conex.executaSql("select *from cliente where cli_nome like'%"+cli.getPesquisa()+"%'");
            conex.rs.first();
            buscaNomeBairro(conex.rs.getInt("cli_baicodigo"));
            cli.setNomeCli(conex.rs.getString("cli_nome"));
            cli.setCep(conex.rs.getString("cli_cep"));
            cli.setCodCli(conex.rs.getInt("cli_codigo"));
            cli.setComplemento(conex.rs.getString("cli_complemento"));
            cli.setNasc(conex.rs.getString("cli_nasc"));
            cli.setRg(conex.rs.getString("cli_rg"));
            cli.setTelefone(conex.rs.getString("cli_telefone"));
            cli.setRua(conex.rs.getString("cli_rua"));
            cli.setNomeBairro(nomeBairro);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar cliente" +ex);
        }
        conex.desconecta();
        return cli;
    }
    
    
    public void buscaNomeBairro(int cod){
        conexBairro.getConnection();
        try {
            conexBairro.executaSql("select *from bairro where baicodigo="+cod);
            conexBairro.rs.first();
            nomeBairro = conexBairro.rs.getString("bainome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar nome do bairro" +ex);
        }
        
        conexBairro.desconecta();
    }
    
    public void Excluir(BeansClientes cli){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cliente where cli_codigo=?");
            pst.setInt(1, cli.getCodCli());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cliente excluído com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao exlcuir cliente" +ex);
        }
        
        
        conex.desconecta();
    }
    
}
