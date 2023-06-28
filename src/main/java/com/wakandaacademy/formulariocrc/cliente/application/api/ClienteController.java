package com.wakandaacademy.formulariocrc.cliente.application.api;

import com.wakandaacademy.formulariocrc.cliente.application.service.ClienteService;
import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

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
        List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
        log.info("[finish] ClienteController - getTodosClientes");
        return clientes;
    }

    @Override
    public ClienteDetalhadoResponse getClientePorCPF(String cpf) {
        log.info("[start] ClienteController - getClientePorCPF");
        log.info("[cpf] {}", cpf);
        ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClientePorCPF(cpf);
        log.info("[finish] ClienteController - getClientePorCPF");
        return clienteDetalhado;
    }

    @Override
    public List<ClientesListResponsePorArea> getClientesPorArea(AreaInteresse areaInteresse) {
        log.info("[start] ClienteController - getClientesPorArea");
        List<ClientesListResponsePorArea> clientes = clienteService.buscaClientesPorArea(areaInteresse);
        log.info("[finish] ClienteController - getClientesPorArea");
        return clientes;
    }

    @Override
    public ClienteDetalhaResponse getClientePorId(UUID idCliente) {
        log.info("[start] ClienteController - getClientesPorId");
        log.info("[finish] ClienteController - getClientesPorId");
        return null;
    }


}
