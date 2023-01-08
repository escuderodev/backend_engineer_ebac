package br.com.escuderodev.aula.array;

import java.util.Scanner;

public class TestaCriacaoArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];

//        inserindo elementos no array via teclado
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();
        }

//        percorrendo o array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println(numeros[2]);
    }

}
