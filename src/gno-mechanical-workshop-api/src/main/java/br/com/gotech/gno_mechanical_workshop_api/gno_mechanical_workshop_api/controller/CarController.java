package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.CarModel;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.CarModelService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.CarBrand;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.service.BrandService;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.enuns.VehicleType;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final BrandService brandService;
    private final CarModelService carModelService;

    @GetMapping("/brands")
    @Operation(description = "Obtem uma lista de marcas")
    public CompletableFuture<List<CarBrand>> getBrands(VehicleType vehicleType) {
        return brandService.getBrands(vehicleType);
    }

    @GetMapping("/models")
    @Operation(description = "Obtem uma lista de modelos a partir da marca")
    public CompletableFuture<List<CarModel>> getModels(Integer carBrandCode, VehicleType vehicleType){
        return carModelService.getCarModels(carBrandCode, vehicleType);
    }
}
