package microservice.core.advert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class AdvertApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvertApplication.class, args);
	}

}
