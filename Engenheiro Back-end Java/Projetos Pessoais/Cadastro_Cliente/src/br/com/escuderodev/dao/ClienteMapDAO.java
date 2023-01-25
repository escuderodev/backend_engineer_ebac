package br.com.escuderodev.dao;

import br.com.escuderodev.domains.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO {

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCodigo())) {
            return false;
        } this.map.put(cliente.getCodigo(), cliente);
            return true;
    }

    @Override
    public void excluir(Long codigo) {
        Cliente clienteCadastrado = this.map.get(codigo);
        if (clienteCadastrado != null) {
            this.map.remove(clienteCadastrado.getCodigo(), clienteCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCodigo());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTelefone(cliente.getTelefone());
        }
    }

    @Override
    public Cliente consultar(Long codigo) {
        return this.map.get(codigo);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
