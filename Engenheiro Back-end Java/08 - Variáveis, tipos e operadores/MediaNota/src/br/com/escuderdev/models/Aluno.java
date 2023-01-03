package br.com.escuderdev.models;

/**
 * @author escuderodev
 */
public class Aluno {

    private int primeiroBimestre = 8;
    private int segundoBimestre = 7;
    private int terceiroBimestre = 9;
    private int quartoBimestre = 5;

//    getters and setters
    public int getPrimeiroBimestre() {
        return primeiroBimestre;
    }

    public void setPrimeiroBimestre(int primeiroBimestre) {
        this.primeiroBimestre = primeiroBimestre;
    }

    public int getSegundoBimestre() {
        return segundoBimestre;
    }

    public void setSegundoBimestre(int segundoBimestre) {
        this.segundoBimestre = segundoBimestre;
    }

    public int getTerceiroBimestre() {
        return terceiroBimestre;
    }

    public void setTerceiroBimestre(int terceiroBimestre) {
        this.terceiroBimestre = terceiroBimestre;
    }

    public int getQuartoBimestre() {
        return quartoBimestre;
    }

    public void setQuartoBimestre(int quartoBimestre) {
        this.quartoBimestre = quartoBimestre;
    }

    /**
     * método para calcular a média das notas
     * @param nota1
     * @param nota2
     * @param nota3
     * @param nota4
     * @return
     */
    public double calculaMediaNota(int nota1, int nota2, int nota3, int nota4) {
        double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        return mediaNotas;
    }

    /**
     * método que valida a aprovação do aluno
     * @param media
     */
    public void validaNotas(double media) {
        if (media >= 7) {
            System.out.println("Você foi aprovado. Parabéns!");
        } else if (media > 5 && media < 7) {
            System.out.println("Você está de recuperação!");
        } else {
            System.out.println("Que pena. Você foi reprovado!");
        }
    }
}
