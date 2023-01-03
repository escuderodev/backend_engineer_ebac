import br.com.escuderodev.models.Conta;

public class Main {
    public static void main(String[] args) {

//        instanciando a classe conta
        Conta primeiraConta = new Conta(1012, 850408, "Eduardo Escudero");
        Conta segundaConta = new Conta(1002, 547859, "Carol Tobias");

//        imprimindo dados das contas
        System.out.println("imprimindo dados das contas");
        System.out.println("Agência: " + primeiraConta.getAgencia() + " - Número: " + primeiraConta.getNumero() + " - Titular: " + primeiraConta.getTitular());
        System.out.println("Agência: " + segundaConta.getAgencia() + " - Número: " + segundaConta.getNumero() + " - Titular: " + segundaConta.getTitular());

//        pulando linha
        System.out.println("");

//        depositando valor
        System.out.println("depositando valor");
        primeiraConta.deposita(1000.00);
        segundaConta.deposita(1000);

//        pulando linha
        System.out.println("");

//        consultando saldo
        System.out.println("consultando saldo");
        System.out.println("Primeira Conta - Saldo R$: " + primeiraConta.getSaldo());
        System.out.println("Segunda Conta - Saldo R$: " + segundaConta.getSaldo());

//        pulando linha
        System.out.println("");

//        sacando valor
        System.out.println("sacando valor");
        primeiraConta.saca(100.00);
        System.out.println("Primeira Conta - Saldo R$: " + primeiraConta.getSaldo());

//        pulando linha
        System.out.println("");

//        transferindo valor
        System.out.println("transferindo valor");
        System.out.println("Primeira Conta - Saldo R$: " + primeiraConta.getSaldo());
        System.out.println("Segunda Conta - Saldo R$: " + segundaConta.getSaldo());

        segundaConta.transfere(150, primeiraConta);

        System.out.println("Primeira Conta - Saldo R$: " + primeiraConta.getSaldo());
        System.out.println("Segunda Conta - Saldo R$: " + segundaConta.getSaldo());
    }
}
