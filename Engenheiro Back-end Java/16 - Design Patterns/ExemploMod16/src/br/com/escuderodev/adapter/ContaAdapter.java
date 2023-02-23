package br.com.escuderodev.adapter;

public class ContaAdapter {

    public String converteSaldoParaString(double saldo) {

        return String.valueOf(saldo);
    }

    public double converteSaldoParaDouble(String saldo) {

        return Double.parseDouble(saldo);
    }
}
