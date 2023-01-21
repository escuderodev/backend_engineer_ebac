import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomesDigitados;
        String[] nomes = new String[4];
        String[] masculino = new String[4];
        String[] feminino = new String[4];

        System.out.println("********************* Exercício - Parte 2 *********************");
        System.out.print("Digite o nome e o gênero de 4 pessoas separados por - e , : ");
        nomesDigitados = scan.next();
        nomes = nomesDigitados.split(",");

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].contains("-m")){
                masculino[i] = nomes[i];
            } else {
                feminino[i] = nomes[i];
            }
        }

        System.out.println("\nImprimindo pessoas do sexo masculino:");
        for (int i = 0; i < masculino.length; i++){
            if (masculino[i] != null)
            System.out.println(masculino[i]);
        }

        System.out.println("\nImprimindo pessoas do sexo feminino:");
        for (int i = 0; i < masculino.length; i++){
            if (feminino[i] != null) {
                System.out.println(feminino[i]);
            }
        }
    }
}
