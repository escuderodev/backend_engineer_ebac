package br.com.escuderodev.aula;

public class ForContinue {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}