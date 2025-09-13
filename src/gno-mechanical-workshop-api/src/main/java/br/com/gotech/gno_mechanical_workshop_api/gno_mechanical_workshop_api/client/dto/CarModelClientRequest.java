package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.Constants;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.enuns.VehicleType;
import lombok.Data;

@Data
public class CarModelClientRequest {

    private Integer codigoTabelaReferencia;
    private Integer codigoTipoVeiculo;
    private Integer codigoMarca;

    public CarModelClientRequest(Integer codigoMarca, VehicleType vehicleType) {

        this.codigoTabelaReferencia = Constants.CODIGO_TABELA_REFERENCIA;
        this.codigoTipoVeiculo = vehicleType.getCode();
        this.codigoMarca = codigoMarca;
    }
}
