package br.com.escuderodev.generics.models;

public class Concessionaria {

    public <T extends ICarro> void venderCarro(T carro) {
        System.out.println("Vendendo " + carro.getClass().getSimpleName());
    }
}
