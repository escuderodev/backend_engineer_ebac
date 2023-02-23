package br.com.escuderodev.adapter;

public class Itau extends ContaAdapter {
    private double saldo;

    public Itau(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
