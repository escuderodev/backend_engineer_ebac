package br.com.escuderodev.generics;

import java.util.ArrayList;
import java.util.List;

public class ExemploJavaGenerics {

    public static void main(String[] args) {

        List<Fruta> listaFruta = new ArrayList<>();
        listaFruta.add(new Maça());
        listaFruta.add(new Banana());
        imprimirFruta(listaFruta);
    }

    public static <T> void imprimir(List<T> lista) {
        for (T item : lista) {
            System.out.println(item);
        }
    }

    public static <T> T pegarPrimeiroDaLista(List<T> lista) {

        return lista.get(0);
    }

    public static void imprimirFruta(List<? extends Fruta> lista) {
        for (Fruta fruta : lista) {
            System.out.println(fruta);
        }
    }
}
