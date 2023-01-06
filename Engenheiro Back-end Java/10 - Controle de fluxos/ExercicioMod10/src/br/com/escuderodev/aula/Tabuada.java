package br.com.escuderodev.aula;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int tabuada;
        System.out.print("Digite a tabuada desejada: ");
        tabuada = scan.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
