package br.com.escuderodev.aula;

public class Casting {

    public static void main(String[] args) {

        int num1 = 8;
//        short num2 = num1; da erro de compilação
//        fazendo um cast para resolver o erro e converter um int para short
        short num2 = (short) num1; //casting explicito

        double valor = 40;
        int valorTotal = (int) valor; //casting explicito - colocando uma caixa maior em uma menor

        long numeroLong = 1111111111111111111l;
        System.out.println(numeroLong);
        int numeroInt = (int) numeroLong;
        System.out.println(numeroInt);

//        devemos sempre evitar fazer um cast explicito

//        cast implicito
        int codigoInt = 1;
        long codigoLong = codigoInt; // cast implicito - colocando uma caixa menor em uma maior

    }
}
