package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.service.impl;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.FipeClient;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto.CarModelClientRequest;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto.Result;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.CarModel;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.enuns.VehicleType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarModelClientServiceImpl implements br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.service.CarModelClientService {

    private final FipeClient fipeClient;

    @Override
    public CompletableFuture<List<CarModel>> getModels(Integer carModelCode, VehicleType vehicleType ) {

        var carModelClientResponse = fipeClient.getCarModels(new CarModelClientRequest(carModelCode, vehicleType));

        return CompletableFuture.supplyAsync(() -> Optional.ofNullable(carModelClientResponse.getBody())
                .map(response -> response.getModelos().stream()
                        .map(Result::toDomainModel)
                        .toList())
                .orElse(List.of()));
    }
}
