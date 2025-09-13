package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Brand;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.enuns.VehicleType;

public interface BrandService {

    CompletableFuture<List<Brand>> getBrands(VehicleType vehicleType);
}
