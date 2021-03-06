package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}


