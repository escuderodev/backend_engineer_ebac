package br.com.escuderodev.models;

public class Comissionado extends Funcionario {

    private double totalVenda;
    private double taxaComissao;
    public Comissionado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

//    getters and setters

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao / 100;
    }

    public double vencimento() {
        return totalVenda * taxaComissao;
    }
}
