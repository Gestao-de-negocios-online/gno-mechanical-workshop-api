package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Address;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Client;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.entity.AddressEntity;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.infrastructure.persistence.entity.ClientEntity;

@Mapper(componentModel = "spring")
public interface RepositoryMapper {

    ClientEntity toClientEntity(Client client);

    Client toClientDomain(ClientEntity entity);

    Address toAddressModel(AddressEntity entity);

    AddressEntity toAddressEntity(Address address);
}
