import br.com.escuderodev.aula.AutoBoxing;
import br.com.escuderodev.aula.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        System.out.println(cliente.getCodigo());

//        ao declarar uma variável de classe com Wrapper, vários métodos ficam disponpiveeis para utilização, como no exemplo abaixo:
//        comparando o valor do código com outro valor = retor 1 para true e -1 para false
        System.out.println(cliente.getCodigo().compareTo(2L));

        AutoBoxing autoBoxing = new AutoBoxing();
//        realizando autoboxing convertendo Wrapper Boolean para primitivo boolean
        autoBoxing.status = true;
//        Boolean status = true;

        System.out.println(autoBoxing.status);

//        unboxing - convertendo wrapper opara primitivo
        boolean status2 = Boolean.TRUE;
        int idade = Integer.valueOf(38);
    }
}