package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Client extends BaseModel {

    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
    private String name;

    @NotBlank(message = "O email é obrigatório")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    private String email;

    @NotBlank(message = "O telefone é obrigatório")
    @Size(max = 11, message = "O telefone deve ter no máximo 11 caracteres")
    private String phone;

    @Size(max = 11, message = "O telefone deve ter no máximo 11 caracteres")
    private String secondaryPhone;

    @NotNull(message = "O endereço é obrigatório")
    private Address address;

    public void validate() {
        validateProperties();

        address.validateProperties();
    }
}
