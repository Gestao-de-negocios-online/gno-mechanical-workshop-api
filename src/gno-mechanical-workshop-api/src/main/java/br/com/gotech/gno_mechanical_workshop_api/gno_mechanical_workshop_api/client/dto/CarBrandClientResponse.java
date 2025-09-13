package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.Brand;
import lombok.Data;

@Data
public class CarBrandClientResponse {

    @JsonProperty("Label")
    private String label;

    @JsonProperty("Value")
    private String value;

    public Brand toModel() {

        return Brand.builder()
                .id(Integer.parseInt(value))
                .name(label)
                .build();
    }
}
