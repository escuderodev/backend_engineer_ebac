package br.com.escuderodev.cadastro.dao.generic;

import br.com.escuderodev.cadastro.domain.Cliente;
import br.com.escuderodev.cadastro.domain.Persistence;
import br.com.escuderodev.cadastro.domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistence> implements IGenericDAO<T> {

    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getClassType();

    public GenericDAO() {
        this.map = new HashMap<>();
        Map<Long, T> internalMap = this.map.get(getClassType());
        if (internalMap == null) {
            internalMap = new HashMap<>();
            this.map.put(getClassType(), internalMap);
        }
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> internalMap = this.map.get(getClassType());
        if (internalMap.containsKey(entity.getKey())) {
            return false;
        }
        internalMap.put(entity.getKey(), entity);
        return true;
    }

    @Override
    public void excluir(Long key) {

    }

    @Override
    public void alterar(T entity) {

    }

    @Override
    public T consultar(Long key) {
        return null;
    }

    @Override
    public Collection<T> buscarTodos() {
        return null;
    }
}
