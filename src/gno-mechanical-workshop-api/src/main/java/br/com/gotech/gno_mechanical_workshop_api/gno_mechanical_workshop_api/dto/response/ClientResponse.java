package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ClientResponse {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String name;
    private String email;
    private String phone;
    private String secondaryPhone;
    private AddressResponse address;
    private List<CarResponse> cars;
}
