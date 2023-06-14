package com.wakandaacademy.formulariocrc.cliente.application.api;

import com.wakandaacademy.formulariocrc.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
    private final ClienteService clienteService;
    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[start] ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finish] ClienteController - postCliente");
        return clienteCriado;
    }

    @Override
    public List<ClienteListResponse> getTodosClientes() {
        log.info("[start] ClienteController - getTodosClientes");
        log.info("[finish] ClienteController - getTodosClientes");
        return null;
    }
}
