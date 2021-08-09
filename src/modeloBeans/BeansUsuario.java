/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author Gabriel
 */
public class BeansUsuario {
    
    private int usuCod;
    private String usuNome;
    private String usuTipo;
    private String usuSenha;
    private String usuPesquisar;

    public String getUsuPesquisar() {
        return usuPesquisar;
    }

    public void setUsuPesquisar(String usuPesquisar) {
        this.usuPesquisar = usuPesquisar;
    }

    public int getUsuCod() {
        return usuCod;
    }

    public void setUsuCod(int usuCod) {
        this.usuCod = usuCod;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuTipo() {
        return usuTipo;
    }

    public void setUsuTipo(String usuTipo) {
        this.usuTipo = usuTipo;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }
    
}
