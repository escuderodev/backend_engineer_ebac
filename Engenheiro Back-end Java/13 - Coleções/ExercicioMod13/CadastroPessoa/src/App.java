import br.com.escuderodev.models.Pessoa;
import br.com.escuderodev.models.PessoaFísica;
import br.com.escuderodev.models.PessoaJuridica;

public class App {
    public static void main(String[] args) {

        PessoaFísica aluno = new PessoaFísica("Eduardo Escudero", "33188942818", 38, "M");
        PessoaJuridica escola = new PessoaJuridica("EBAC", "23465802000172");

        System.out.println("Aluno: " + aluno.getNome() + " - CPF: " + aluno.getCpf() + " - Idade: " + aluno.getIdade() + " - Gênero: " + aluno.getGenero());
        System.out.println("Escola: " + escola.getNome() + " - CNPJ: " + escola.getCnpj());

        System.out.println("");
        aluno.acordar();
        aluno.andar();
        aluno.dormir();

        System.out.println("");
        escola.contratarFuncionario();
        escola.criarNovoCurso();
        escola.admitirAluno(aluno);

    }
}