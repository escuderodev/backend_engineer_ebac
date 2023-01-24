package br.com.escuderodev.models.agregacao;

public class Produto {
    private long codigo;
    private String nome;
    private float preco;
    private int tamanho;

    public Produto(long codigo, String nome, float preco, int tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    //    getters and setters
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void vendido() {
        System.out.println("Vendido!");
    }
}
