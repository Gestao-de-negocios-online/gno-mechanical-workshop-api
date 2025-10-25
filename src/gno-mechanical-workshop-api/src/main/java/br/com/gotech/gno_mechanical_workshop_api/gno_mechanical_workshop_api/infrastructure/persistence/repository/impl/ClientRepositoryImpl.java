package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.repository.impl;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.exception.BusinessException;
import org.springframework.stereotype.Repository;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Client;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.RepositoryMapper;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.entity.ClientEntity;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.jpa.ClientJpaRepository;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.repository.ClientRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Repository
@RequiredArgsConstructor
public class ClientRepositoryImpl implements ClientRepository {

    private final ClientJpaRepository jpaRepository;
    private final RepositoryMapper mapper;

    @Override
    public Client save(Client client) {

        ClientEntity entity = mapper.toClientEntity(client);
        entity = jpaRepository.save(entity);

        return mapper.toClientDomain(entity);
    }

    @Override
    public List<Client> getAll() {

        List<ClientEntity> clients = jpaRepository.findAllByDeletedAtIsNull();

        return clients.stream()
                .map(mapper::toClientDomain)
                .toList();
    }

    @Override
    public Client getById(Long id) {

        ClientEntity client = jpaRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(() -> new BusinessException("Cliente não encontrado"));

        return mapper.toClientDomain(client);
    }

    @Override
    public Client update(Client client) {

        ClientEntity entity = mapper.toClientEntity(client);
        entity = jpaRepository.save(entity);

        return mapper.toClientDomain(entity);
    }
}
