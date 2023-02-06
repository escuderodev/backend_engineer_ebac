package br.com.escuderodev.singleton;

public class SingletonProperty {
    private static SingletonProperty singleton;
    private String value;

//    constritor privado para que ninguém possa instanciar esta classe fora dela
    private SingletonProperty(String value) {
        this.value = value;
    }

//    instanciando a classe apenas uma vez
    public static SingletonProperty getInstance(String value) {
        if (singleton == null) {
            singleton = new SingletonProperty(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
