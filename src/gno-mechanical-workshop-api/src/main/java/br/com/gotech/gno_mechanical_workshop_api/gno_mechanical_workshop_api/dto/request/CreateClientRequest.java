package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateClientRequest {

    private String name;
    private String email;
    private String phone;
    private String secondaryPhone;
    private CreateAddressRequest address;
}
