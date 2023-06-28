package com.wakandaacademy.formulariocrc.cliente.application.api;

import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import com.wakandaacademy.formulariocrc.cliente.domain.Cliente;
import com.wakandaacademy.formulariocrc.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class ClienteDetalhaResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private AreaInteresse areaInteresse;
    private LocalDateTime dataHoraDoCadastro;

    public ClienteDetalhaResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.telefone = cliente.getTelefone();
        this.sexo = cliente.getSexo();
        this.dataNascimento = cliente.getDataNascimento();
        this.areaInteresse = cliente.getAreaInteresse();
        this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
    }
}
