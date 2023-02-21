package br.com.escuderodev.observer;

public class ObserverApp {

    public static void main(String[] args) {
        Jornalista jornalista = new Jornalista();
        jornalista.add(new TV());

        jornalista.setTitle("Vergonha Palmeirense");
        jornalista.setNotice("Palmeiras não tem Mundial!");

        jornalista.notifyAll(jornalista.getTitle(), jornalista.getNotice());
    }
}
