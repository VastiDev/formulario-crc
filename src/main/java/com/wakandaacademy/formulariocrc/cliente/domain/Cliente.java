package com.wakandaacademy.formulariocrc.cliente.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    @CPF
    private String cpf;
    private AreaInteresse areaInteresse;
    @NotNull
    private Boolean aceitaTermos;


    private LocalDateTime dataHoraDoCadastro;

    public Cliente(String nomeCompleto, String email, String celular, String telefone,
                   Sexo sexo, LocalDate dataNascimento, String cpf, AreaInteresse areaInteresse, Boolean aceitaTermos) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.areaInteresse = areaInteresse;
        this.aceitaTermos = aceitaTermos;
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
