package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.entity.ClientEntity;

import java.util.List;
import java.util.Optional;

public interface ClientJpaRepository extends JpaRepository<ClientEntity, Long> {

    List<ClientEntity> findAllByDeletedAtIsNull();
    Optional<ClientEntity> findByIdAndDeletedAtIsNull(Long id);
}
