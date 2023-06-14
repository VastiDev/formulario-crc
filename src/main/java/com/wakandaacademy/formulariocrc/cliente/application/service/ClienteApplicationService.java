package com.wakandaacademy.formulariocrc.cliente.application.service;

import com.wakandaacademy.formulariocrc.cliente.application.api.ClienteListResponse;
import com.wakandaacademy.formulariocrc.cliente.application.api.ClienteRequest;
import com.wakandaacademy.formulariocrc.cliente.application.api.ClienteResponse;
import com.wakandaacademy.formulariocrc.cliente.application.repository.ClienteRepository;
import com.wakandaacademy.formulariocrc.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[start] ClienteApplicationService - criaCliente ");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finish] ClienteApplicationService - criaCliente ");
        return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
    }

    @Override
    public List<ClienteListResponse> buscaTodosClientes() {
        log.info("[start] ClienteApplicationService - buscaTodosClientes ");
        log.info("[finish] ClienteApplicationService - buscaTodosClientes ");
        return null;
    }
}
