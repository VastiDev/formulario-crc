package com.wakandaacademy.formulariocrc.cliente.application.api;

import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import com.wakandaacademy.formulariocrc.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class ClienteListAreaResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String cpf;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraDoCadastro;
}
