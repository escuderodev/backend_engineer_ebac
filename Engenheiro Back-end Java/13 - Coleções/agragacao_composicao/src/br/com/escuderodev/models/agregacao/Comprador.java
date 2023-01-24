package br.com.escuderodev.models.agregacao;

public class Comprador {
    private String nome;
    private float verba;


//    getters and setters
    public float getVerba() {
        return verba;
    }

    public void setVerba(float verba) {
        this.verba = verba;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void compra() {
        System.out.println("Comprar...");
    }
}
