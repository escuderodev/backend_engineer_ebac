import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("");

        System.out.print("Digite um valor inteiro: ");
        int valorInt = scan.nextInt();
        System.out.println("Valor Inteiro: " + valorInt);
        System.out.println("Casting implícito");
        double valorDouble = valorInt;
        System.out.println("Valor Long: " + valorDouble);

        System.out.println("");

        System.out.print("Digite um valor com casa decimal: ");
        double valorDecimal = scan.nextDouble();
        System.out.println("Valor Double: " + valorDecimal);
        System.out.println("Casting explícito");
        int valorInteiro = (int) valorDecimal;
        System.out.println(valorInteiro);
    }
}