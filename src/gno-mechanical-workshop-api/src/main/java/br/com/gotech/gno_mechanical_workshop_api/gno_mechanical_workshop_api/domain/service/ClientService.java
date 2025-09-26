package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Client;

import java.util.List;

public interface ClientService {

    Client create(Client client);
    List<Client> getAll();
    Client getBydId(Long id);
    Client update(Client client);
}
