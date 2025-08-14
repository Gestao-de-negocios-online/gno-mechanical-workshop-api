package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.enuns.VehicleType;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.model.Brand;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.service.BrandService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final BrandService brandService;

    @GetMapping("/brands")
    public CompletableFuture<List<Brand>> getBrands(VehicleType vehicleType) {
        return brandService.getBrands(vehicleType);
    }
}
