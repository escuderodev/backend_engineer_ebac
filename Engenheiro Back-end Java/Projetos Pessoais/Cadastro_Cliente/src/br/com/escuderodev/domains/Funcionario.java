package br.com.escuderodev.domains;

public class Funcionario extends Pessoa {

    public Funcionario(Long codigo, String nome, String telefone) {
        super(codigo, nome, telefone);
    }

    public void vender(Cliente cliente) {
        System.out.println(this.getNome() + " vendeu para o Cliente " + cliente.getNome());
    }
}
