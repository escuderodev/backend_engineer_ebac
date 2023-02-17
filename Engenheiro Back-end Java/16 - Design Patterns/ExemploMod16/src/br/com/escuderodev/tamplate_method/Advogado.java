package br.com.escuderodev.tamplate_method;

public class Advogado extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Defendendo seus clientes em audiência...");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltando para a casa às 17 hr...");
    }

    @Override
    protected void irAoTrabalho() {
        System.out.println("Indo trabalhar às 12 hr...");
    }

    @Override
    protected void levantar() {
        System.out.println("Lenvantando da cama às 9 hr...");
    }
}
