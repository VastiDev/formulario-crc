package com.wakandaacademy.formulariocrc.cliente.infra;

import com.wakandaacademy.formulariocrc.cliente.application.repository.ClienteRepository;
import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import com.wakandaacademy.formulariocrc.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataMongoRepository clienteSpringDataMongoRepository;

    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - salva ");
        clienteSpringDataMongoRepository.save(cliente);
        log.info("[finish] ClienteInfraRepository - salva ");
        return cliente;
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[start] ClienteInfraRepository - buscaTodosClientes ");
        List<Cliente> todosClientes = clienteSpringDataMongoRepository.findAll();
        log.info("[finish] ClienteInfraRepository - buscaTodosClientes ");
        return todosClientes;
    }

    @Override
    public Cliente buscaClientePorCPF(String cpf) {
        log.info("[start] ClienteInfraRepository - buscaClientePorCPF ");
        Cliente cliente = clienteSpringDataMongoRepository.findByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("cliente não encontrado"));
        log.info("[finish] ClienteInfraRepository - buscaClientePorCPF ");
        return cliente;
    }

    @Override
    public List<Cliente> buscaClientesPorArea(AreaInteresse areaInteresse) {
        log.info("[start] ClienteInfraRepository - buscaClientesPorArea");
        List<Cliente> todosClientesPorArea = clienteSpringDataMongoRepository.findByAreaInteresse(areaInteresse);
        log.info("[finish] ClienteInfraRepository - buscaClientesPorArea");
        return todosClientesPorArea;
    }

    @Override
    public Cliente buscaClientePorId(UUID idCliente) {
        log.info("[start] ClienteInfraRepository - buscaClientePorId");
        Cliente cliente = clienteSpringDataMongoRepository.findById(idCliente)
                        .orElseThrow(() -> new RuntimeException("cliente não encontrado"));
        log.info("[finish] ClienteInfraRepository - buscaClientePorId");
        return cliente;
    }
}
