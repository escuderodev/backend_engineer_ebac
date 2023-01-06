import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double primeiroBimestre;
        double segundoBimestre;
        double terceiroBimestre;
        double quartoBimestre;

        System.out.print("Digite a nota do Primeiro Bimestre: ");
        primeiroBimestre = scan.nextDouble();
        System.out.print("Digite a nota do Segundo Bimestre: ");
        segundoBimestre = scan.nextDouble();
        System.out.print("Digite a nota do Terceiro Bimestre: ");
        terceiroBimestre = scan.nextDouble();
        System.out.print("Digite a nota do Quarto Bimestre: ");
        quartoBimestre = scan.nextDouble();

        validaNota(primeiroBimestre,segundoBimestre,terceiroBimestre,quartoBimestre);

    }

    public static void validaNota(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Parabéns! Sua média foi " + media + " e vocẽ foi aprovado.");
        } else if (media >= 5 && media < 7) {
            System.out.println("Sua média foi " + media + " e você está de recuperação!");
        } else {
            System.out.println("Que pena! Sua mpedia foi " + media + " e você foi reprovado.");
        }
    }
}