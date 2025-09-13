package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client;

import java.util.List;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto.CarModelClientRequest;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto.CarModelClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto.CarBrandClientRequest;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto.CarBrandClientResponse;

@FeignClient(url = "${fipe.api.url}", name = "fipeClient")
@Validated
public interface FipeClient {

    @PostMapping(value = "/ConsultarMarcas", produces = "application/json")
    ResponseEntity<List<CarBrandClientResponse>> getCarBrands(@RequestBody CarBrandClientRequest request);

    @PostMapping(value = "/ConsultarModelos", produces = "application/json")
    ResponseEntity<CarModelClientResponse> getCarModels(@RequestBody CarModelClientRequest request);
}
