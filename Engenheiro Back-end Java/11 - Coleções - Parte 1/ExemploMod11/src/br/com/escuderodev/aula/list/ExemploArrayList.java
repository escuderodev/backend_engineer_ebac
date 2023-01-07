package br.com.escuderodev.aula.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdenada();
        exemploListaNumeros();
    }

    private static void exemploListaSimples() {
        System.out.println("*****exemplo lista simples*****");
        List<String> lista = new ArrayList<String>();
        lista.add("Eduardo Escudero");
        lista.add("Carol Tobias");
        lista.add("Juan Tobias");
        lista.add("Alícia Valentina");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenada() {
        System.out.println("*****exemplo lista simples ordenada*****");
        List<String> lista = new ArrayList<String>();
        lista.add("Eduardo Escudero");
        lista.add("Carol Tobias");
        lista.add("Juan Tobias");
        lista.add("Alícia Valentina");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaNumeros() {
        System.out.println("*****exemplo lista números*****");
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(38);
        numeros.add(8);
        numeros.add(39);
        numeros.add(3);
        System.out.println(numeros);
//        ordenando a lista com o método sort
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
