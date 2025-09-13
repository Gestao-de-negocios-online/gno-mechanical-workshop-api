package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.entity.ClientEntity;

public interface ClientJpaRepository extends JpaRepository<ClientEntity, Long> {

}
