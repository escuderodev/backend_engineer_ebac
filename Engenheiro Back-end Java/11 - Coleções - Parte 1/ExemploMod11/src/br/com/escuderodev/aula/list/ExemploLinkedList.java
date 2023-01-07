package br.com.escuderodev.aula.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {

    public static void main(String[] args) {
        exemploListaSimples();
//        exempliListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples() {
        System.out.println("***** exemploListaSimples *****");

//        criando uma lista
        List<String> lista = new LinkedList<>();

//        adicionando itme a lista
        lista.add("Eduardo");
        lista.add("Carol");
        lista.add("Juan");
        lista.add("Alícia");
        System.out.println(lista);
        System.out.println("");

//        removendo itme da lista
        lista.remove(1);
        System.out.println(lista);

        lista.add("Carol");

//        pesquisando por um elemento dentro de uma lista
        lista.contains("Juan");
        System.out.println(lista.contains("Juan"));
        System.out.println("");

//        percorrendo os index da lista
        for (String nome:lista) {
            System.out.println(nome);
        }

        System.out.println("");

//        imprimindo uma posição expecífica da lista
        System.out.println(lista.get(1));

    }

    private static void exempliListaSimplesOrdemAscendente() {
        System.out.println("***** exempliListaSimplesOrdemAscendente *****");
        List<String> lista = new LinkedList<>();
        lista.add("Eduardo");
        lista.add("Carol");
        lista.add("Juan");
        lista.add("Alícia");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
