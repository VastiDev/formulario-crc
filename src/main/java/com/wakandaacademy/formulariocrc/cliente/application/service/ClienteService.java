package com.wakandaacademy.formulariocrc.cliente.application.service;

import com.wakandaacademy.formulariocrc.cliente.application.api.ClienteListResponse;
import com.wakandaacademy.formulariocrc.cliente.application.api.ClienteRequest;
import com.wakandaacademy.formulariocrc.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
}
