package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Brand;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.enuns.VehicleType;

public interface CarBrandClientService {

    public CompletableFuture<List<Brand>> getBrands(VehicleType vehicleType);
}
