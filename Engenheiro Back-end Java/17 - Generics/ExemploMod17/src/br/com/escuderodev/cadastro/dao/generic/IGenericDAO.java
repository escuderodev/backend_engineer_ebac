package br.com.escuderodev.cadastro.dao.generic;

import br.com.escuderodev.cadastro.domain.Persistence;
import br.com.escuderodev.cadastro.domain.Produto;

import java.util.Collection;

public interface IGenericDAO <T extends Persistence> {
    public Boolean cadastrar(T entity);
    public void excluir(Long key);
    public void alterar(T entity);
    public T consultar(Long key);
    public Collection<T> buscarTodos();

}
