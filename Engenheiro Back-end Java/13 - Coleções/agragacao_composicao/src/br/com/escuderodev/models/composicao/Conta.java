package br.com.escuderodev.models.composicao;

public class Conta {
    private Banco banco;
    private int agencia = 0001;
    private int numero;
    private double saldo;

    public Conta(Banco banco, int numero, double saldo) {
        this.banco = banco;
        this.numero = numero;
        this.saldo = saldo;
    }

    //    getters and setters

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            extrato();
        }
    }

    public void extrato() {
        System.out.println("Saldo atual R$ " + this.saldo);
    }


}
