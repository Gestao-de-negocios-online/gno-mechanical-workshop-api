package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.CarModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Result {

    @JsonProperty("Label")
    private String label;

    @JsonProperty("Value")
    private String value;

    public CarModel toDomainModel(){

        return CarModel.builder()
                .id(Integer.valueOf(value))
                .model(label)
                .build();
    }
}
