import br.com.escuderodev.models.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Aluno> feminino = new ArrayList<>();
        List<Aluno> masculino = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            String nomeDigitado;
            String sexoDigitado;

//            coleta dados do usuário
            System.out.print("Digite o primeiro nome: ");
            nomeDigitado = scan.next();
            System.out.print("Digite o sexo [m ou f]: ");
            sexoDigitado = scan.next();
            Aluno aluno = new Aluno(nomeDigitado, sexoDigitado);

//            valida sexo
            if (aluno.getSexo().equals("m")) {
                masculino.add(aluno);
            } else if (aluno.getSexo().equals("f")) {
                feminino.add(aluno);
            } else {
                System.out.println("Sexo digitado é inválido!");
            }
        }
        System.out.println("");
        System.out.println("Feminino:  " + feminino);
        System.out.println("Masculino: " + masculino);
    }
}
