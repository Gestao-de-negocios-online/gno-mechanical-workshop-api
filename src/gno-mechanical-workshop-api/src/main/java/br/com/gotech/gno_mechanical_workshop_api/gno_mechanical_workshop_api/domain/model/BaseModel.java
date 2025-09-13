package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.model;

import java.time.LocalDateTime;
import java.util.List;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.exception.BusinessException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public abstract class BaseModel {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public abstract void validate();

    protected void validateProperties() {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        var violations = validator.validate(this);

        if (!violations.isEmpty()) {

            List<String> messages = violations
                    .stream()
                    .map(ConstraintViolation::getMessageTemplate)
                    .toList();



            throw new BusinessException("Informações fornecidas inválidas", messages);
        }
    }
}
