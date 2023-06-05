package com.wakandaacademy.formulariocrc;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Data
@RequestMapping("/")
public class FormularioCrcApplication {
	@GetMapping
	public String getHomeTeste(){
		return "Crc Odonto - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(FormularioCrcApplication.class, args);

	}

}
