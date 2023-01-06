package br.com.escuderodev.aula;

import java.util.Scanner;

public class Equals {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tipo de animal: ");
        String textoDigitado = scan.next();
        String animal = exampleOfIF(textoDigitado);
        System.out.println(animal);
    }

    public static String exampleOfIF(String animal) {
        String result;

        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }
}
