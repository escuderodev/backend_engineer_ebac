package br.com.escuderodev.tamplate_method;

public class Bombeiro extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Apagando incêncio...");
    }
}
