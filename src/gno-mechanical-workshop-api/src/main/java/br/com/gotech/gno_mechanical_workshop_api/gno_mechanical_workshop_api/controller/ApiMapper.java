package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.controller;

import org.mapstruct.Mapper;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Address;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Client;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request.CreateClientRequest;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.response.AddressResponse;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.response.ClientResponse;

@Mapper(componentModel = "spring")
public interface ApiMapper {

    Client toClientModel(CreateClientRequest clientRequest);

    ClientResponse toClientResponse(Client client);

    Address toAddressModel(AddressResponse addressResponse);

    AddressResponse toAddressResponse(Address address);
}
