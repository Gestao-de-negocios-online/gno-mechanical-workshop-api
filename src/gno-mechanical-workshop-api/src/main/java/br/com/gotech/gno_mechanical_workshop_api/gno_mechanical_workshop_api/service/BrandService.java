package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.enuns.VehicleType;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.model.Brand;

public interface BrandService {

    CompletableFuture<List<Brand>> getBrands(VehicleType vehicleType);
}
