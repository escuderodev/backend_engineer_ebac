package br.com.escuderodev.facade;

public class Apartamento {

    private double tamanho;
    private double valor;
    private String endereco;


//    constructor


    public Apartamento(double tamanho, double valor, String endereco) {
        this.tamanho = tamanho;
        this.valor = valor;
        this.endereco = endereco;
    }

    //    getters and setters
    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
