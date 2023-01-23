package br.com.escuderodev.models;

public class Caneta {
    private String cor;

    public Caneta(String cor) {
        this.cor = cor;
    }

    public void escrever(String mensagem)  {
        System.out.println(mensagem);
    }

//    getter and setter
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
