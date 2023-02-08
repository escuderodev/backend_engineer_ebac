package br.com.escuderodev.abstract_factory;

public class ContractFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorolaCar(100,"Cheio","Azul");
        } else {
            return new FluenceCar(60,"Cheio","Preto");
        }
    }
}
