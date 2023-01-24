package br.com.escuderodev.models.agregacao;

public class Vendedor {
    private String nome;
    private float comissao;

//    getters and setters
    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void vende() {
        System.out.println("Vender...");
    }
}
