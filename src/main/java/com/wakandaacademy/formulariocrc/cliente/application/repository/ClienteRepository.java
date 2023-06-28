package com.wakandaacademy.formulariocrc.cliente.application.repository;

import com.wakandaacademy.formulariocrc.cliente.application.api.ClienteListResponse;
import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import com.wakandaacademy.formulariocrc.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
    List<Cliente> buscaTodosClientes();
    Cliente buscaClientePorCPF(String cpf);

    List<Cliente> buscaClientesPorArea(AreaInteresse areaInteresse);
    Cliente buscaClientePorId(UUID idCliente);
    void deletaCliente(Cliente cliente);
}
