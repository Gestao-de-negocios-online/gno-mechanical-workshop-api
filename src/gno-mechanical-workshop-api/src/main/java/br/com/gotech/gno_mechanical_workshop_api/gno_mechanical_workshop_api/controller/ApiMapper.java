package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.controller;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request.CreateAddressRequest;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request.UpdateAddressRequest;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request.UpdateClientRequest;
import org.mapstruct.Mapper;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Address;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Client;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request.CreateClientRequest;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.response.AddressResponse;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.response.ClientResponse;

@Mapper(componentModel = "spring")
public interface ApiMapper {

    Client toClientModel(CreateClientRequest clientRequest);
    Client toClientModel(UpdateClientRequest clientRequest);

    ClientResponse toClientResponse(Client client);

    Address toAddressModel(CreateAddressRequest addressResponse);
    Address toAddressModel(UpdateAddressRequest addressResponse);

    AddressResponse toAddressResponse(Address address);
}
