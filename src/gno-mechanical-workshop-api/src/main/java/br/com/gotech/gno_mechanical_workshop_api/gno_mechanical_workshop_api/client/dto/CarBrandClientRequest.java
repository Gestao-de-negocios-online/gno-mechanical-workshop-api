package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.Constants;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.enuns.VehicleType;
import lombok.Data;

@Data
public class CarBrandClientRequest {

    private Integer codigoTabelaReferencia;
    private Integer codigoTipoVeiculo;

    public CarBrandClientRequest(VehicleType vehicleType) {

        this.codigoTabelaReferencia = Constants.CODIGO_TABELA_REFERENCIA;
        this.codigoTipoVeiculo = vehicleType.getCode();
    }
}
