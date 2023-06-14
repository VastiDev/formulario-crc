package com.wakandaacademy.formulariocrc.cliente.infra;

import com.wakandaacademy.formulariocrc.cliente.application.repository.ClienteRepository;
import com.wakandaacademy.formulariocrc.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataJPARepository  clienteSpringDataJPARepository;

    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - salva ");
        clienteSpringDataJPARepository.save(cliente);
        log.info("[finish] ClienteInfraRepository - salva ");
        return cliente;
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[start] ClienteInfraRepository - buscaTodosClientes ");
        List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
        log.info("[finish] ClienteInfraRepository - buscaTodosClientes ");
        return todosClientes;
    }
}
