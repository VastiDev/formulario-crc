package com.wakandaacademy.formulariocrc.cliente.application.api;

import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.UUID;

public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String celular;
    private AreaInteresse areaInteresse;
    private LocalDate dataNascimento;
    private String cpf;
}
