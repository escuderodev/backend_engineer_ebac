package br.com.escuderodev.domain;

public abstract class Carro {
    private int cavalosDePotencia;
    private String tipoCombustível;
    private String Cor;

    public Carro(int cavalosDePotencia, String tipoCombustível, String cor) {
        this.cavalosDePotencia = cavalosDePotencia;
        this.tipoCombustível = tipoCombustível;
        Cor = cor;
    }

    public void ligarMotor() {
        System.out.println("Carro escolhido: " + getClass().getSimpleName());
        System.out.println("O tipo de combustível é " + tipoCombustível + " e a potência do motor é " + cavalosDePotencia);
    }

    public void analiseMecanica() {
        System.out.println("Análise realizada e o veículo está com o tanque cheio e a mecânica em dia!");
    }

    public void partiuViagem() {
        System.out.println("Partiu viagem...");
    }
}
