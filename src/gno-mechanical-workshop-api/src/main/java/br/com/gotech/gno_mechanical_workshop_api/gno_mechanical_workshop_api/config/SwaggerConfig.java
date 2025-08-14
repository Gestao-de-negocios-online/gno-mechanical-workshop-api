package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Gerenciador de Oficina Mecânica")
                        .version("1.0")
                        .description(
                                "Api para gerenciar uma oficina mecânica, incluindo clientes, veículos e serviços."));
    }
}
