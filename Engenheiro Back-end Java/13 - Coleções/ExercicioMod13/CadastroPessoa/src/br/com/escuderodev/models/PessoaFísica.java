package br.com.escuderodev.models;

public class PessoaFísica extends Pessoa {
    private String cpf;
    private int idade;
    private String genero;

    public PessoaFísica(String nome, String cpf, int idade, String genero) {
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

//    getters and setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void andar() {
        System.out.println(this.getNome() + " está andando...");
    }

    public void acordar() {
        System.out.println(this.getNome() + " acordou!");
    }

    public void dormir() {
        System.out.println(this.getNome() + " dormiu!");
    }
}
