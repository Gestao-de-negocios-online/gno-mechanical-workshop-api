package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.controller.exception;

import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.domain.exception.BusinessException;
import br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.dto.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@Slf4j
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({BusinessException.class})
    ResponseEntity<ErrorResponse> handleBusinessException(BusinessException businessException){

        log.error("ERRO DE NEGÓCIO AO PROCESSAR SOLICITAÇÃO :: {}", String.join(" \n\n ",
                businessException.getErrors()));

        ErrorResponse errorResponse = ErrorResponse.builder()
                .messages(businessException.getErrors())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler({Exception.class})
    ResponseEntity<ErrorResponse> handleTechinicalException(Exception exception){

        log.error("ERRO DE TÉCNICO AO PROCESSAR SOLICITAÇÃO :: {}", String.join(" \n\n ",
                exception.getMessage()));

        ErrorResponse errorResponse = ErrorResponse.builder()
                .messages(List.of("Erro técnico inesperado"))
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}
