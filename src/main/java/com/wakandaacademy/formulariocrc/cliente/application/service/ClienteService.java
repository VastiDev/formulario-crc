package com.wakandaacademy.formulariocrc.cliente.application.service;

import com.wakandaacademy.formulariocrc.cliente.application.api.*;
import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();

    ClienteDetalhadoResponse buscaClientePorCPF(String cpf);

    List<ClientesListResponsePorArea> buscaClientesPorArea(AreaInteresse areaInteresse);
}
