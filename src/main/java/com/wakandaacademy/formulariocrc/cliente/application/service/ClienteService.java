package com.wakandaacademy.formulariocrc.cliente.application.service;

import com.wakandaacademy.formulariocrc.cliente.application.api.*;
import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();

    ClienteDetalhadoResponse buscaClientePorCPF(String cpf);

    List<ClientesListResponsePorArea> buscaClientesPorArea(AreaInteresse areaInteresse);

    ClienteDetalhaResponse buscaClientePorId(UUID idCliente);

    void deletaClientePorId(UUID idCliente);
}
