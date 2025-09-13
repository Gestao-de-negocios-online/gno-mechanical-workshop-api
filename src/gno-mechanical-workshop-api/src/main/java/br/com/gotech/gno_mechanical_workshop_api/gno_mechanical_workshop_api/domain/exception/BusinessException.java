package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Data
@Getter
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException{

    private final List<String> errors;

    public BusinessException(String message){
        super(message);
        errors = List.of();
    }

    public BusinessException(String message, List<String> errors){
        super(message);
        this.errors = errors;

    }

    public List<String> getErrors(){
        return errors;
    }
}
