package br.com.escuderodev.models.agregacao;

import java.util.List;

public class Venda {

    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;

    //    getters and setters
    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void concretizaVenda() {
        System.out.println("Vendedor: " + this.vendedor.getNome());
        System.out.println("Cliente: " + this.comprador.getNome());
        System.out.println("Itens do Pedido: ");
        for (Produto produto:this.produtos) {
            System.out.println("Produto: " + produto.getNome() + " R$ " + produto.getPreco());
        }
    }
    public void cancelaVenda() {
        System.out.println("Venda cancelada!");
    }

    @Override
    public String toString() {
        return "Venda{" +
                "Cliente: " + comprador.getNome() +
                ", Vendedor: " + vendedor.getNome() +
                ", Produtos: " + produtos +
                '}';
    }
}
