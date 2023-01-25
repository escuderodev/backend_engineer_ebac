import br.com.escuderodev.models.Assalariado;
import br.com.escuderodev.models.Comissionado;
import br.com.escuderodev.models.Funcionario;
import br.com.escuderodev.models.Horista;

public class Main {
    public static void main(String[] args) {

        Horista horista = new Horista("Eduardo", "Escudero", "33188942818");
        Comissionado comissionado = new Comissionado("Carol", "Tobias", "33104296871");
        Assalariado assalariado = new Assalariado("Valmir", "Escudero", "01031815805");

        System.out.println("Horista Nome: " + horista.getNome() + " " + horista.getSobrenome() + " CPF: " + horista.getCpf());
        System.out.println("Comissionado Nome: " + comissionado.getNome() + " " + comissionado.getSobrenome() + " CPF: " + comissionado.getCpf());
        System.out.println("Assalariado Nome: " + assalariado.getNome() + " " + assalariado.getSobrenome() + " CPF: " + assalariado.getCpf());

        horista.setHorasTrabalhadas(8);
        horista.setPrecoHora(50.00);
        System.out.println("Horista - Salário R$ " + horista.vencimento());

        comissionado.setTaxaComissao(5);
        comissionado.setTotalVenda(1000.00);
        System.out.println("Comissionado - Salário R$ " + comissionado.vencimento());

        assalariado.setSalario(1000.00);
        System.out.println("Assalariado - Salário R$ " + assalariado.getSalario());

        System.out.println("Utilizando o método imprimir() para mostrar o  vencimento()");
        imprimir(horista);
        imprimir(comissionado);
        imprimir(assalariado);
    }

    public static void imprimir(Funcionario funcionario) {
        System.out.println(funcionario.getNome() + " receberá como salário R$ " + funcionario.vencimento());
    }
}