import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parte1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomesDigitados;
        String[] nomes = new String[4];

        System.out.println("********************* Exercício - Parte 1 *********************");
        System.out.print("Digite 4 nomes separados por , : ");
        nomesDigitados = scan.next();
        nomes = nomesDigitados.split(",");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
