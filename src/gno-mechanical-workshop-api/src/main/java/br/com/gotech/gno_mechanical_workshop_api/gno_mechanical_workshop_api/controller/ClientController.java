package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.controller;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request.UpdateClientRequest;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.response.ClientResponse;
import feign.Response;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Client;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.ClientService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request.CreateClientRequest;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;
    private final ApiMapper apiMapper;

    @PostMapping("/client")
    @Operation(summary = "Cria um novo cliente")
    public ResponseEntity<ClientResponse> create(@RequestBody CreateClientRequest clientRequest) {

        Client client = apiMapper.toClientModel(clientRequest);
        client = clientService.create(client);

        return ResponseEntity.ok(apiMapper.toClientResponse(client));
    }

    @PatchMapping("/client")
    @Operation(summary = "Atualiza as informações do cliente")
    public ResponseEntity<ClientResponse> update(@RequestBody UpdateClientRequest clientRequest){

        Client client = apiMapper.toClientModel(clientRequest);
        client = clientService.update(client);

        return ResponseEntity.ok(apiMapper.toClientResponse(client));
    }

    @GetMapping("/client")
    @Operation(summary = "Obtém todos os clientes ativos")
    public ResponseEntity<List<ClientResponse>> getAll(){

        var clients = clientService.getAll();
        var clientResponseList = clients.stream()
                .map(apiMapper::toClientResponse)
                .toList();

        return ResponseEntity.ok(clientResponseList);
    }

    @GetMapping("/client/{id}")
    @Operation(summary = "Obtém um cliente a partir do ID fornecido")
    public ResponseEntity<ClientResponse> getById(@PathVariable Long id){

        var client = clientService.getBydId(id);

        return ResponseEntity.ok(apiMapper.toClientResponse(client));
    }
}
