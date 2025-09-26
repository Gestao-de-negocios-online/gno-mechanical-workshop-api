package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class UpdateAddressRequest {

    private Long id;
    private LocalDateTime createdAt;
    private String street;
    private Integer number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
}
