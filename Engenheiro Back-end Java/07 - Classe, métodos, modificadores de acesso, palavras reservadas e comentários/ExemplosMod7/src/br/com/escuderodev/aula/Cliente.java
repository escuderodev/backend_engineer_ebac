package br.com.escuderodev.aula;
/*
@author escuderodev

@version 1.0
 */

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;

//    construtor
    public Cliente(int codigo, String nome, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

//getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

//    metodo para imprimir endereço
    public void imprimeEndereco() {

        System.out.println("Endereço: " + this.endereco);
    }
}
