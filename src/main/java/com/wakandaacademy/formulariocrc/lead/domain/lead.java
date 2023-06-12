package com.wakandaacademy.formulariocrc.lead.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
git 
public class lead {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idLead;
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
    @org.hibernate.validator.constraints.br.CPF
    private String CPF;

    private AreaInteresse areainteresse;
    @NotNull
    private boolean aceitaTermos;
    private LocalDateTime momentoDoCadastro;
}
