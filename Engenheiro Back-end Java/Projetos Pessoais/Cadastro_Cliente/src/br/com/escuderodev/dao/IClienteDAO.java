package br.com.escuderodev.dao;

import br.com.escuderodev.domains.Cliente;

import java.util.Collection;

public interface IClienteDAO {
    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long codigo);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long codigo);
    public Collection<Cliente> buscarTodos();

}
