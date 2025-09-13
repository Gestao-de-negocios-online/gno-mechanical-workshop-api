package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Client;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.ClientService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request.CreateClientRequest;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;
    private final ApiMapper apiMapper;

    @PostMapping("/client")
    @Operation(description = "Criar novo cliente")
    public Client createClient(@RequestBody CreateClientRequest clientRequest) {

        Client client = apiMapper.toClientModel(clientRequest);

        return clientService.create(client);
    }
}
