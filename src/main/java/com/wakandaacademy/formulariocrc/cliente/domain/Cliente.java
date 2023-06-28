package com.wakandaacademy.formulariocrc.cliente.domain;

import com.wakandaacademy.formulariocrc.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Data
@Document(collection = "cliente")
public class Cliente {
    @Id
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
    @Field("cpf")
    @Indexed(unique = true)
    private String cpf;
    private AreaInteresse areaInteresse;
    @NotNull
    private Boolean aceitaTermos;

    private LocalDateTime dataHoraDoCadastro;

    public Cliente(ClienteRequest clienteRequest) {
        this.idCliente = UUID.randomUUID();
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.email = clienteRequest.getEmail();
        this.celular = clienteRequest.getCelular();
        this.telefone = clienteRequest.getTelefone();
        this.sexo = clienteRequest.getSexo();
        this.dataNascimento = clienteRequest.getDataNascimento();
        this.cpf = clienteRequest.getCpf();
        this.areaInteresse = clienteRequest.getAreaInteresse();
        this.aceitaTermos = clienteRequest.getAceitaTermos();
        this.dataHoraDoCadastro = LocalDateTime.now();

    }
}
