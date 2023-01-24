package br.com.escuderodev.models.composicao;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Banco banco, int numero, double saldo, double limite) {
        super(banco, numero, saldo);
        this.limite = limite;
    }


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
