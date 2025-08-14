package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.service.impl;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Service;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.service.CarBrandClientService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.enuns.VehicleType;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.model.Brand;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.service.BrandService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final CarBrandClientService carBrandClientService;

    @Override
    public CompletableFuture<List<Brand>> getBrands(VehicleType vehicleType) {

        log.info("Obtendo dados de veículos do tipo: {}", vehicleType.getDescription());

        return carBrandClientService.getBrands(vehicleType);
    }
}
