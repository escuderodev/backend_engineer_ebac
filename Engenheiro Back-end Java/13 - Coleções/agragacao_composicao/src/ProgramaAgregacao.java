import br.com.escuderodev.models.agregacao.Comprador;
import br.com.escuderodev.models.agregacao.Produto;
import br.com.escuderodev.models.agregacao.Venda;
import br.com.escuderodev.models.agregacao.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class ProgramaAgregacao {
    public static void main(String[] args) {
        Produto bolo = new Produto(1L, "Bolo de Chocolate", 140.00f, 1);
        Produto brigadeiro = new Produto(2L, "Brigadeiro de Chocolate", 40.00f, 12);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(bolo);
        produtos.add(brigadeiro);

        Vendedor vendedorEduardo = criarVendedor("Eduardo Escudero", 10);

        Comprador comprador = criarComprador("Juan Tobias", 500.00f);

        Venda venda = new Venda();
        venda.setVendedor(vendedorEduardo);
        venda.setComprador(comprador);
        venda.setProdutos(produtos);

        venda.concretizaVenda();

    }

    private static Comprador criarComprador(String nome, float verba) {
        Comprador comprador = new Comprador();
        comprador.setNome(nome);
        comprador.setVerba(verba);
        return comprador;
    }

    private static Vendedor criarVendedor(String nome, float comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

}