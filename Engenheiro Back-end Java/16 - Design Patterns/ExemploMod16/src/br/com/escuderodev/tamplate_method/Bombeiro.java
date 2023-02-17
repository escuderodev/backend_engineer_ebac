package br.com.escuderodev.tamplate_method;

public class Bombeiro extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Apagando incêncio...");
    }

    @Override
    protected void levantar() {
        System.out.println("Lenvantando da cama às 6 hr.");
    }
}
