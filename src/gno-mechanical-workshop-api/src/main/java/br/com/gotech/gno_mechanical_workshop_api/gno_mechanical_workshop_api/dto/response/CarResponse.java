package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CarResponse {

    private String alias;
    private String brand;
    private String model;
    private Integer year;
    private String observation;
}