package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.impl;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.exception.BusinessException;
import org.springframework.stereotype.Service;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Client;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.ClientService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.repository.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client create(Client client) {

        log.info("Criando novo cliente: {}", client);

        client.validate();

        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAll() {

        log.info("Obtendo uma lista de clientes ativos");

        return clientRepository.getAll();
    }

    @Override
    public Client getBydId(Long id) {

        log.info("Obtendo cliente pelo id: {}", id);

        return clientRepository.getById(id);
    }

    @Override
    public Client update(Client client) {

        log.info("Atualizando as informações do cliente {}", client);

        if(client == null || client.getId() <= 0){
            throw new BusinessException("Cliente não informado para edição");
        }

        var actualClient = getBydId(client.getId());

        if(actualClient == null){
            throw new BusinessException("Cliente " + client.getName() + " não encontrado para atualização das informações");
        }

        return clientRepository.update(client);
    }
}
