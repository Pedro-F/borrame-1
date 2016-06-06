package pruebaWireMock;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableAutoConfiguration

//Comentario de pruebas
public class MicroservicioA {

	@RequestMapping("/")
	String home() {
		return "Hello World! by PA --- <BR> MicroservicioA";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MicroservicioA.class, args);
	}

}