package ch.rohner.microservices.led;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LedApplication {

	public static void main(String[] args) {
		SpringApplication.run(LedApplication.class, args);
	}

}
