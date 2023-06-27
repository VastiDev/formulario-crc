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


    public static List<ClientesListResponsePorArea> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClientesListResponsePorArea::new)
                .collect(Collectors.toList());
    }

    public ClientesListResponsePorArea(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.telefone = cliente.getTelefone();
        this.sexo = cliente.getSexo();
        this.dataNascimento = cliente.getDataNascimento();
        this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
    }
}
