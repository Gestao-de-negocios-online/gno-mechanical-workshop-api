package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CrateCarRequest {

    private String alias;
    private String brand;
    private String model;
    private Integer year;
    private String observation;
}
