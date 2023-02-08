package br.com.escuderodev.abstract_factory;

public class NotContractFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new VoyageCar(100,"Cheio","Azul");
        } else {
            return new GolCar(60,"Cheio","Preto");
        }
    }
}
