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
public class BeansTatuadores {

    /**
     * @return the pesquisa
     */
    
    private int codigo;
    private String nome;
    private String especialidade;
    private String tempoProfissao;
    private String pesquisa;
    
    
    
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    
    
    
    
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the tempoProfissao
     */
    public String getTempoProfissao() {
        return tempoProfissao;
    }

    /**
     * @param tempoProfissao the tempoProfissao to set
     */
    public void setTempoProfissao(String tempoProfissao) {
        this.tempoProfissao = tempoProfissao;
    }
    
    
    
    
}
