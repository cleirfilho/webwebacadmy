package br.ufac.sgcm.model;

public class Unidade {
    
    private Long id;
    private String nome;
    private String endereco;
    public Long getId() {
        return id;
    }
    public void setId(int i) {
        this.id = (long) i;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
