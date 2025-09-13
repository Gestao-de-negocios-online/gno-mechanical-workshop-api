package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model.CarModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CarModelClientResponse {

    @JsonProperty("Modelos")
    private List<Result> modelos;
}
