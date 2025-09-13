package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Service;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.FipeClient;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto.CarBrandClientRequest;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto.CarBrandClientResponse;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.service.CarBrandClientService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.CarBrand;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.enuns.VehicleType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarBrandClientServiceImpl implements CarBrandClientService {

    private final FipeClient fipeClient;

    @Override
    public CompletableFuture<List<CarBrand>> getBrands(VehicleType vehicleType) {

        var brandClientResponse = fipeClient.getCarBrands(new CarBrandClientRequest(vehicleType));

        return CompletableFuture.supplyAsync(() -> Optional.ofNullable(brandClientResponse.getBody())
                .map(response -> response.stream()
                        .map(CarBrandClientResponse::toModel)
                        .toList())
                .orElse(List.of()));
    }
}
