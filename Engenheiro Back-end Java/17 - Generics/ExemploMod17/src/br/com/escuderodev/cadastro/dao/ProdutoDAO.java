package br.com.escuderodev.cadastro.dao;

import br.com.escuderodev.cadastro.domain.Produto;

import java.util.Collection;

public class ProdutoDAO implements IProdutoDAO {
    @Override
    public Boolean cadastrar(Produto produto) {
        return null;
    }

    @Override
    public void excluir(Long codigo) {

    }

    @Override
    public void alterar(Produto produto) {

    }

    @Override
    public Produto consultar(Long codigo) {
        return null;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
