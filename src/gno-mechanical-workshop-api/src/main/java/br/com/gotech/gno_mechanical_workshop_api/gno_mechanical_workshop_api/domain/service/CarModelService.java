package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.CarModel;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.enuns.VehicleType;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface CarModelService {

    CompletableFuture<List<CarModel>> getCarModels(Integer carBrandCode, VehicleType vehicleType);
}
