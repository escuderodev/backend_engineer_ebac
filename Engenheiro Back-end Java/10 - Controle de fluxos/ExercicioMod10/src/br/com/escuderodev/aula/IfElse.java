package br.com.escuderodev.aula;

public class IfElse {

    public static void main(String[] args) {
        int idade = 15;

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        double nota = 6;

        if (nota >= 7) {
            System.out.println("Sua nota foi " + nota + " e você foi aprovado!");
        } else if (nota > 5 && nota < 7) {
            System.out.println("Sua nota foi " + nota + " e você está de recuperação!");
        } else {
            System.out.println("Sua nota foi " + nota + " e vocẽ foi reprovado!");
        }
    }
}
