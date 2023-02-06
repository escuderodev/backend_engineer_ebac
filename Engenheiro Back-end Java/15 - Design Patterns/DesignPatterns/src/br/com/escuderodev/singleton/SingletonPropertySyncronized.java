package br.com.escuderodev.singleton;

public class SingletonPropertySyncronized {
    private static SingletonPropertySyncronized singleton;
    private String value;

//    constritor privado para que ninguém possa instanciar esta classe fora dela
    private SingletonPropertySyncronized(String value) {
        this.value = value;
    }

//    instanciando a classe apenas uma vez
    public static synchronized SingletonPropertySyncronized getInstance(String value) {
        if (singleton == null) {
            singleton = new SingletonPropertySyncronized(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
