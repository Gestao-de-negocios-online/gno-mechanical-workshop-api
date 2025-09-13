package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.impl;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Service;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.service.CarBrandClientService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.CarBrand;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.BrandService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.enuns.VehicleType;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final CarBrandClientService carBrandClientService;

    @Override
    public CompletableFuture<List<CarBrand>> getBrands(VehicleType vehicleType) {

        log.info("Obtendo dados de veículos do tipo: {}", vehicleType.getDescription());

        return carBrandClientService.getBrands(vehicleType);
    }
}
