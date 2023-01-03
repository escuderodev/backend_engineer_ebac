package br.com.escuderodev.models;

public class Conta {
    private int agencia;
    private int numero;
    private String titular;
    private double saldo;

    /**
     * Contrutor personalizado.
     * @param numero
     * @param agencia
     * @param titular
     */
    public Conta(int agencia, int numero, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

//    getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    /**
     * Função que permite depositar valor
     * @param valor
     */
    public void deposita(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor deve ser maior que 0.");
        }
    }

    /**
     * função que permite sacar valor
     * @param valor
     */
    public void saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente! Saldo R$: " + this.saldo);
        }
    }

    /**
     * função que permite transferir valor
     * @param valor
     * @param outraConta
     */
    public void transfere(double valor, Conta outraConta) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
            outraConta.deposita(valor);
        } else {
            System.out.println("Saldo insuficiente! Saldo R$: " + this.saldo);
        }
    }
}
