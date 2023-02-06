package br.com.escuderodev.singleton;

public class Singleton {
    private static Singleton singleton;

//    constritor privado para que ninguém possa instanciar esta classe fora dela
    private Singleton() {

    }

//    instanciando a classe apenas uma vez
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
