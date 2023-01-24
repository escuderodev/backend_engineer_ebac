package br.com.escuderodev.models;

public class Horista extends Funcionario {

    private double precoHora;
    private double horasTrabalhadas;
    public Horista(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

//    getters and setters

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double vencimento() {
        return precoHora * horasTrabalhadas;
    }
}
