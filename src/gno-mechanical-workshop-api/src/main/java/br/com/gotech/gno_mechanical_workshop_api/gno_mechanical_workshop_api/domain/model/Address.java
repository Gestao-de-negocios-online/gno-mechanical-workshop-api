package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Address extends BaseModel {

    @NotBlank(message = "O logradouro é obrigatório")
    @Size(max = 100, message = "O logradouro deve ter no máximo 100 caracteres")
    private String street;

    @Positive(message = "O número deve ser um valor positivo")
    private Integer number;

    @NotBlank(message = "O complemento é obrigatório")
    @Size(max = 100, message = "O complemento deve ter no máximo 100 caracteres")
    private String complement;

    @NotBlank(message = "O bairro é obrigatório")
    @Size(max = 100, message = "O bairro deve ter no máximo 100 caracteres")
    private String neighborhood;

    @NotBlank(message = "A cidade é obrigatória")
    @Size(max = 100, message = "A cidade deve ter no máximo 100 caracteres")
    private String city;

    @NotBlank(message = "O estado é obrigatório")
    @Size(max = 20, message = "O estado deve ter no máximo 20 caracteres")
    private String state;


    @Override
    public void validate() {
        validateProperties();
    }
}
