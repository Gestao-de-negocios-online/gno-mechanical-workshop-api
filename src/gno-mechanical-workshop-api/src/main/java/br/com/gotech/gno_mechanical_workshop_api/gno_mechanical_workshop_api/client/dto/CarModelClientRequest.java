package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.dto;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.client.Constants;
import lombok.Data;

@Data
public class CarModelClientRequest {

    private Integer codigoTabelaReferencia;
    private Integer codigoTipoVeiculo;
    private Integer codigoMarca;

    public CarModelClientRequest(Integer codigoMarcaVeiculo, Integer codigoMarca) {

        this.codigoTabelaReferencia = Constants.CODIGO_TABELA_REFERENCIA;
        this.codigoTipoVeiculo = codigoMarcaVeiculo;
        this.codigoMarca = codigoMarca;
    }
}
