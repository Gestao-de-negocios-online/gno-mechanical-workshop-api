package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Car extends BaseModel{

    @NotBlank(message = "O apelido é obrigatório")
    @Size(max = 100, message = "O apelido deve ter no máximo 100 caracteres")
    private String alias;

    @NotBlank(message = "A marca é obrigatória")
    @Size(max = 100, message = "A marca deve ter no máximo 100 caracteres")
    private String brand;

    @NotBlank(message = "O modelo é obrigatório")
    @Size(max = 100, message = "O modelo deve ter no máximo 100 caracteres")
    private String model;

    @Positive(message = "O ano do veiculo deve ter um valor maior que 1900")
    private Integer year;

    @Size(max = 100, message = "A observação deve ter no máximo 500 caracteres")
    private String observation;

    @Override
    public void validate() {
        validateProperties();
    }
}
