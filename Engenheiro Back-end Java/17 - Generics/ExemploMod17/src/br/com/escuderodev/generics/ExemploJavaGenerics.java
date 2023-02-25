package br.com.escuderodev.generics;

import java.util.ArrayList;
import java.util.List;

public class ExemploJavaGenerics {

    public static void main(String[] args) {
        List<String> listaString = new ArrayList<>();
        listaString.add("Eduardo");
        listaString.add("Carol");
        System.out.println("\nlistaString");
        imprimir(listaString);
        System.out.println("Primeiro da lista: " + pegarPrimeiroDaLista(listaString));

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(1L);
        listaLong.add(2L);
        System.out.println("\nlistaLong");
        imprimir(listaLong);
        System.out.println("Primeiro da lista: " + pegarPrimeiroDaLista(listaLong));
    }

    public static <T> void imprimir(List<T> lista) {
        for (T item : lista) {
            System.out.println(item);
        }
    }

    public static <T> T pegarPrimeiroDaLista(List<T> lista) {
        return lista.get(0);
    }
}
