package com.wakandaacademy.formulariocrc.cliente.infra;

import com.wakandaacademy.formulariocrc.cliente.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ClienteSpringDataMongoRepository extends MongoRepository<Cliente, UUID> {
}
