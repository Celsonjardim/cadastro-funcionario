package br.com.f1rst.cadastro_funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CadastroFuncionarioApplication {

	@GetMapping
	public String getHomeTeste(){
		return "Cadastro funcionario - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(CadastroFuncionarioApplication.class, args);
	}

}
