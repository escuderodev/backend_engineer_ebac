package br.com.escuderodev.tamplate_method;

public class Policial extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Prendendo os Bandidos...");
    }
}
