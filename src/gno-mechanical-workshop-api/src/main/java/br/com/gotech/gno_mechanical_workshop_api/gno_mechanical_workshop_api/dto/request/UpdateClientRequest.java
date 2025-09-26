package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class UpdateClientRequest {

    private Long id;
    private LocalDateTime createdAt;
    private String name;
    private String email;
    private String phone;
    private String secondaryPhone;
    private UpdateAddressRequest address;
}
