package br.com.escuderodev.tamplate_method;

public abstract class Trabalhador {

    public void executarRotina() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    private void voltarParaCasa() {
        System.out.println("Voltando para casa...");
    }

    protected abstract void trabalhar();

    private void irAoTrabalho() {
        System.out.println("Indo para o trabalho...");
    }

    private void iniciarRotina() {
        System.out.println("Iniciando rotina...");
    }

    private void levantar() {
        System.out.println("Levantando da cama...");
    }
}
