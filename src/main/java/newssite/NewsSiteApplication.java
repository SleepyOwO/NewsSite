package newssite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewsSiteApplication {

	public static void main(String[] args) {

		SpringApplication.run(NewsSiteApplication.class, args);

	}

	@GetMapping("/index")
	public String sayHello(@RequestParam(value = "user", defaultValue = "Guest") String name) {
		return String.format("Привет %s!", name);
	}
}
