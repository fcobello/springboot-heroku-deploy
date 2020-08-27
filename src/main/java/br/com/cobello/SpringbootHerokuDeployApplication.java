package br.com.cobello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootHerokuDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHerokuDeployApplication.class, args);
	}

	@GetMapping("/")
	public String hello()
	{
		return "Seu primeiro deploy no Heroku";
	}
}
