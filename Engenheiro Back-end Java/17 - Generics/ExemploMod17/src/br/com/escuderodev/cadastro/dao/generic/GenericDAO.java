package br.com.escuderodev.cadastro.dao.generic;

import br.com.escuderodev.cadastro.domain.Persistence;
import br.com.escuderodev.cadastro.domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistence> implements IGenericDAO<T> {

    private Map<Class, Map<Long, T>> map;

    public GenericDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(T entity) {
        return null;
    }

    @Override
    public void excluir(Long key) {

    }

    @Override
    public void alterar(T entity) {

    }

    @Override
    public Produto consultar(Long key) {
        return null;
    }

    @Override
    public Collection<T> buscarTodos() {
        return null;
    }
}
