package com.wakandaacademy.formulariocrc.cliente.application.repository;

import com.wakandaacademy.formulariocrc.cliente.application.api.ClienteListResponse;
import com.wakandaacademy.formulariocrc.cliente.domain.Cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
    List<Cliente> buscaTodosClientes();
}
