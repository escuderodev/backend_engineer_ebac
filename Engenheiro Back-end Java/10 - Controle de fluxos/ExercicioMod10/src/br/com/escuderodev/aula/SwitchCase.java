package br.com.escuderodev.aula;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tamanho;
        System.out.print("Digite o tamanho desejado: ");
        tamanho = scan.next();

        switch (tamanho) {
            case "pp":
                System.out.println("super pequeno");
                break;
            case "p":
                System.out.println("pequeno");
                break;
            case "m":
                System.out.println("médio");
                break;
            case "g":
                System.out.println("grande");
                break;
            case "gg":
                System.out.println("extra grande");
                break;
            default:
                System.out.println("tamanho inválido!");
                break;
        }
    }
}
