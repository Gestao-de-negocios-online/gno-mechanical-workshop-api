package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.repository;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Client;

import java.util.List;

public interface ClientRepository {

    Client save(Client client);
    List<Client> getAll();

    /**
     * @param id Id do cliente na base de dados
     * @return Cliente
     */
    Client getById(Long id);
    Client update(Client client);
}
