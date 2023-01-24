package br.com.escuderodev.models;

public class Assalariado extends Funcionario {

    private double salario;
    public Assalariado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

//    getters and setters

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double vencimento() {
        return salario;
    }
}
