package br.com.escuderodev.singleton;

public class AppSingleton {
    public static void main(String[] args) {
//        primeira instancia
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

//        tentando instanciar pela segunda vez
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);
    }
}
