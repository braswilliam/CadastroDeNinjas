package dev.projeto.spring.CadastroNinja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CadastroNinjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroNinjaApplication.class, args);
	}

}
