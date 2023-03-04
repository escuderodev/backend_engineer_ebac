package br.com.escuderodev.cadastro.dao;

import br.com.escuderodev.cadastro.dao.generic.GenericDAO;
import br.com.escuderodev.cadastro.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteMapDAO() {
        super();
    }

    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
    }

}
