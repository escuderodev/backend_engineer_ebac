package br.com.escuderodev.domain;

public class AlugaCarroPopular extends LocadoraDeCarro {
    @Override
    public Carro selecionaCarro(String opcao) {
        if ("A".equals(opcao)) {
            return new Voyage(80,"Gazolina","Preto");
        } else {
            return new Gol(70,"Gazolina", "Prata");
        }
    }
}
