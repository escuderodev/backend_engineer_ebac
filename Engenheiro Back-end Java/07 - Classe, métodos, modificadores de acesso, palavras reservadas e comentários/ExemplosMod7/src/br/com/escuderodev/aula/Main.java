package br.com.escuderodev.aula;

public class Main {

    public static void main(String[] args) {

        Cliente primeiroCliente = new Cliente(1,"Eduardo Escudero", "Rua Cristiano Lobe, 169 Apto 22B");

        System.out.println("Cliente " + primeiroCliente.getCodigo() + " - " + primeiroCliente.getNome());
//        System.out.println("Endereço: " + primeiroCliente.getEndereco());
        primeiroCliente.imprimeEndereco();
    }
}


