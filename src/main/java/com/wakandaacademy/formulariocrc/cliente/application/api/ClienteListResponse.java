package com.wakandaacademy.formulariocrc.cliente.application.api;

import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import com.wakandaacademy.formulariocrc.cliente.domain.Cliente;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String celular;
    private AreaInteresse areaInteresse;
    private LocalDate dataNascimento;
    private String cpf;

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return null;
    }
}
