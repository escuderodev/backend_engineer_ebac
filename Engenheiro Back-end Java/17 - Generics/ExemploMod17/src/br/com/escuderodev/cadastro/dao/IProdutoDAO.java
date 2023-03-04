package br.com.escuderodev.cadastro.dao;

import br.com.escuderodev.cadastro.domain.Produto;

import java.util.Collection;

public interface IProdutoDAO {
    public Boolean cadastrar(Produto produto);
    public void excluir(Long codigo);
    public void alterar(Produto produto);
    public Produto consultar(Long codigo);
    public Collection<Produto> buscarTodos();
}
