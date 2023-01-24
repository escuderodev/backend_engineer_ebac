import br.com.escuderodev.models.composicao.Banco;
import br.com.escuderodev.models.composicao.ContaCorrente;
import br.com.escuderodev.models.composicao.ContaPoupança;

public class ProgramaBanco {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.setCodigo(237L);
        banco.setNome("Bradesco");

        ContaCorrente contaCorrente = new ContaCorrente(banco, 850408, 1000, 100);
        ContaPoupança contaPoupança = new ContaPoupança(banco, 521478, 1000);

        System.out.println(contaCorrente.getBanco().getNome() + " " + contaCorrente.getAgencia() + " " + contaCorrente.getNumero() + " " + contaCorrente.getSaldo() + " " + contaCorrente.getLimite());
        System.out.println(contaPoupança.getBanco().getNome() + " " + contaPoupança.getAgencia() + " " + contaPoupança.getNumero() + " " + contaPoupança.getSaldo());
    }
}
