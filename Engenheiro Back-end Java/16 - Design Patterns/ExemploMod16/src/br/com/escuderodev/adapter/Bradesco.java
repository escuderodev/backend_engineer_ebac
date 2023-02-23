package br.com.escuderodev.adapter;

public class Bradesco extends ContaAdapter {

    private String saldo;

    public Bradesco(String saldo) {
        this.saldo = saldo;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
