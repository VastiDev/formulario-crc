package com.wakandaacademy.formulariocrc.cliente.application.api;


import com.wakandaacademy.formulariocrc.cliente.domain.Cliente;
import com.wakandaacademy.formulariocrc.cliente.domain.Sexo;
import lombok.Value;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ClientesListResponsePorArea {
    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraDoCadastro;


}
