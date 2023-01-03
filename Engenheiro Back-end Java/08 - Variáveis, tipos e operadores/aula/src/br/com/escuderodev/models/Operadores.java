package br.com.escuderodev.models;

public class Operadores {

    private int num1;
    private int num2;
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int somar(int num1, int num2) {
       return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public int resto(int num1, int num2) {
        return num1 % num2;
    }

    public int incremento(int num1) {
        return num1+=1;
    }

    public int decremento(int num1){
        return num1-=1;
    }
}
