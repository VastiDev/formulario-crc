package com.wakandaacademy.formulariocrc.cliente.application.api;

import com.wakandaacademy.formulariocrc.cliente.domain.AreaInteresse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ClienteListResponse> getTodosClientes();

    @GetMapping(value = "/{cpf}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteDetalhadoResponse getClientePorCPF(@PathVariable String cpf);

    @GetMapping(value = "/v2/{areaInteresse}" )
    @ResponseStatus(code = HttpStatus.OK)
    List<ClientesListResponsePorArea> getClientesPorArea(@PathVariable AreaInteresse areaInteresse);

}

