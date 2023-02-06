package br.com.escuderodev.singleton;

public class AppSingletonProperty {
    public static void main(String[] args) {
        SingletonProperty singletonProperty = SingletonProperty.getInstance("Palmeiras não tem mundial!");
        SingletonProperty singletonProperty1 = SingletonProperty.getInstance("Corinthians");

//        perceba que somente será impresso o valor da primeira instancia
        System.out.println(singletonProperty.getValue());
        System.out.println(singletonProperty1.getValue());
    }
}
