package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ErrorResponse {

    private List<String> messages;
    private int statusCode;
}
