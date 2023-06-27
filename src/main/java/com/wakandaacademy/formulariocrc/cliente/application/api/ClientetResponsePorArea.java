package com.wakandaacademy.formulariocrc.cliente.application.api;


import com.wakandaacademy.formulariocrc.cliente.domain.Sexo;
import lombok.Value;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Value
public class ClientetResponsePorArea {
    private String nomeCompleto;
    private String email;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraDoCadastro;

}
