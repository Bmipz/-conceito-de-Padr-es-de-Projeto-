package dio.ProjetoPadraojava;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoPadraojavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPadraojavaApplication.class, args);
	}

}
