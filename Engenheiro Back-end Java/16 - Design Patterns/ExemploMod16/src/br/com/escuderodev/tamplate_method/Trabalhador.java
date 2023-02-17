package br.com.escuderodev.tamplate_method;

public abstract class Trabalhador {

    public void executarRotina() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected void voltarParaCasa() {
        System.out.println("Voltando para casa...");
    }

    protected abstract void trabalhar();

    protected void irAoTrabalho() {
        System.out.println("Indo para o trabalho...");
    }

    protected void iniciarRotina() {
        System.out.println("Iniciando rotina...");
    }

    protected void levantar() {
        System.out.println("Levantando da cama...");
    }
}
