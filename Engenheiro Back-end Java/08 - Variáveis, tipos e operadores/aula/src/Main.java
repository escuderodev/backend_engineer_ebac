import br.com.escuderodev.models.Operadores;
import br.com.escuderodev.models.TipoDados;

public class Main {
    public static void main(String[] args) {

        TipoDados tipoDados = new TipoDados();
        System.out.println(tipoDados.mensagem());
        System.out.println(tipoDados.numeroInteriroInt());
        System.out.println(tipoDados.numeroInteriroLong());
        System.out.println(tipoDados.numeroDouble());
        System.out.println(tipoDados.numeroFloat());
        System.out.println(tipoDados.trueOrFalse());

//        operadores aritimérticos
        Operadores operadores = new Operadores();
        System.out.println("Soma: " + operadores.somar(10,4));
        System.out.println("Subtração: " + operadores.subtrair(10,4));
        System.out.println("Multiplicação: " + operadores.multiplicar(10,4));
        System.out.println("Divisão: " + operadores.dividir(10,4));
        System.out.println("Resto: " + operadores.resto(8,4));

        System.out.println("Incremento: " + operadores.incremento(10));
        System.out.println("Decremento: " + operadores.decremento(10));

        int numero1 = 10;
        int numero2 = 5;

//        operadores lógicos
        System.out.println(numero1 > numero2);
        System.out.println(numero1 < numero2);
        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);
        System.out.println(numero1 >= numero2);
        System.out.println(numero1 <= numero2);
        System.out.println(numero1 > numero2 && numero1 < 20);
        System.out.println(numero1 < numero2 || numero2 > 0);

    }
}