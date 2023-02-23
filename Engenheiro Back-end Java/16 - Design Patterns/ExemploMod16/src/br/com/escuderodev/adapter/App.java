package br.com.escuderodev.adapter;

public class App {

    public static void main(String[] args) {

        Itau itau = new Itau(100);
        System.out.println("Saldo no Itaú R$ " + itau.getSaldo());

        Bradesco bradesco = new Bradesco(itau.converteSaldoParaString(itau.getSaldo()));
        System.out.println("Saldo no Bradesco R$ " + bradesco.getSaldo());

        Itau novaContaItau = new Itau(bradesco.converteSaldoParaDouble(bradesco.getSaldo()));
        System.out.println("Saldo da Nova Conta Itaú R$ " + itau.getSaldo());


    }
}
