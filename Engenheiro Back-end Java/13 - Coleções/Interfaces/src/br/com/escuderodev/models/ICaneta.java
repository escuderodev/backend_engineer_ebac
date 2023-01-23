package br.com.escuderodev.models;

public interface ICaneta {

    public void escrever(String texto);

//    método default a partir do java 8
    default void escreverDefault(String texto) {
        System.out.println(texto);
    }

}
