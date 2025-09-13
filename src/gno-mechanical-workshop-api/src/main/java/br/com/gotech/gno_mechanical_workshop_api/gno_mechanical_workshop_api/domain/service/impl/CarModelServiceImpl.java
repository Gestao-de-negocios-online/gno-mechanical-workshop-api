package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.impl;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.service.CarModelClientService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.CarModel;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.CarModelService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.enuns.VehicleType;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
@AllArgsConstructor
public class CarModelServiceImpl implements CarModelService {

    private final CarModelClientService carModelClientService;

    @Override
    public CompletableFuture<List<CarModel>> getCarModels(Integer carBrandCode, VehicleType vehicleType) {

        log.info("Obtendo dados de veiculos da marca: {}", carBrandCode);

        return carModelClientService.getModels(carBrandCode, vehicleType);
    }
}
