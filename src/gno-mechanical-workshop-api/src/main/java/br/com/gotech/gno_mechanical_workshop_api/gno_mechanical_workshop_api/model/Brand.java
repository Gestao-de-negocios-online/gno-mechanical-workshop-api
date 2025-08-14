package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Brand {

    private int id;
    private String name;
}
