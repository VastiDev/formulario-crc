package com.wakandaacademy.formulariocrc.cliente.application.api;

import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import com.wakandaacademy.formulariocrc.cliente.domain.Sexo;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Value
public class ClienteAlteracaoRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String celular;
    private String telefone;
    private AreaInteresse areaInteresse;

}
