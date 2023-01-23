package br.com.escuderodev.models;

public class Lapis extends Caneta implements ICaneta {

    private String cor;

    @Override
    public void escrever(String texto) {
        System.out.println(texto);
    }
}
