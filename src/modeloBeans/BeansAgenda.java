/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class BeansAgenda {
    private int agendaCod;
    private String nomeTatu;
    private String nomeCli;
    private Date data;
    private String status;
    private String observa;
    private String clienteNasc;

    public String getClienteNasc() {
        return clienteNasc;
    }

    public void setClienteNasc(String clienteNasc) {
        this.clienteNasc = clienteNasc;
    }
    

    public int getAgendaCod() {
        return agendaCod;
    }

    public void setAgendaCod(int agendaCod) {
        this.agendaCod = agendaCod;
    }

    public String getNomeTatu() {
        return nomeTatu;
    }

    public void setNomeTatu(String nomeTatu) {
        this.nomeTatu = nomeTatu;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObserva() {
        return observa;
    }

    public void setObserva(String observa) {
        this.observa = observa;
    }
    
    
    
    
    
}
