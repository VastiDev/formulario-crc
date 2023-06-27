package com.wakandaacademy.formulariocrc.cliente.application.service;

import com.wakandaacademy.formulariocrc.cliente.application.api.*;
import com.wakandaacademy.formulariocrc.cliente.application.repository.ClienteRepository;
import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
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
        List<Cliente> clientes = clienteRepository.buscaTodosClientes();
        log.info("[finish] ClienteApplicationService - buscaTodosClientes ");
        return ClienteListResponse.converte(clientes);
    }

    @Override
    public ClienteDetalhadoResponse buscaClientePorCPF(String cpf) {
        log.info("[start] ClienteApplicationService - buscaClientePorCPF ");
        Cliente cliente = clienteRepository.buscaClientePorCPF(cpf);
        log.info("[finish] ClienteApplicationService - buscaClientePorCPF ");
        return new ClienteDetalhadoResponse(cliente);
    }

    @Override
    public List<ClientesListResponsePorArea> buscaClientesPorArea(AreaInteresse areaInteresse) {
        log.info("[start] ClienteApplicationService - buscaClientesPorArea");
        List<Cliente> clientes = clienteRepository.buscaClientesPorArea(areaInteresse);
        log.info("[finish] ClienteApplicationService - buscaClientesPorArea");
        return ClientesListResponsePorArea.converte(clientes);
    }
}
