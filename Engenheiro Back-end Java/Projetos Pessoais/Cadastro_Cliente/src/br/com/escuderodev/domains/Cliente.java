package br.com.escuderodev.domains;

public class Cliente extends Pessoa {

    public Cliente(Long codigo, String nome, String telefone) {
        super(codigo, nome, telefone);
    }

    public void realizaCompra() {
        System.out.println("Comprou!");
    }
}
