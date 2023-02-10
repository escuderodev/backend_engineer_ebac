package br.com.escuderodev.domain;

public class AlugaCarroExecutivo extends LocadoraDeCarro {
    @Override
    public Carro selecionaCarro(String opcao) {
        if ("A".equals(opcao)) {
            return new Azera(100,"Gazolina","Preto");
        } else {
            return new Civic(80,"Gazolina", "Prata");
        }
    }
}
