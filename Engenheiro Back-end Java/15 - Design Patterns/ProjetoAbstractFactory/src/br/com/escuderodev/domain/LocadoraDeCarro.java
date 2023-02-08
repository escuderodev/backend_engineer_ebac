package br.com.escuderodev.domain;

public abstract class LocadoraDeCarro {
    public Carro criaCarro(String requestGrade) {
        Carro carro = selecionaCarro(requestGrade);
        carro = preparaCarro(carro);
        return carro;
    }

    private Carro preparaCarro(Carro carro) {
        carro.ligarMotor();
        carro.analiseMecanica();
        return carro;
    }

    public abstract Carro selecionaCarro(String requestedGrade);
}
