package br.com.escuderodev.models;

/**
 * @author escuderodev
 */
public class TipoDados {
    private int codigo;
    private long codigoMaior;
    private double valorDecimalDouble;
    private String texto;
    private boolean status;
    private float valorDecimalFloat;
    private short shor;
    private byte bt;

//    métodos
    public String mensagem() {

        return "Palmeiras não tem mundial!";
    }

    public int numeroInteriroInt() {
        return 18;
    }

    public long numeroInteriroLong() {
        return 18;
    }

    public double numeroDouble() {
        return 18;
    }

    public float numeroFloat() {
        return 18;
    }

    public boolean trueOrFalse() {
        return true;
    }

}
