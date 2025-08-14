package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@EnableFeignClients
@SpringBootApplication
@ImportAutoConfiguration({ FeignAutoConfiguration.class })
public class GnoMechanicalWorkshopApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GnoMechanicalWorkshopApiApplication.class, args);
	}

}
