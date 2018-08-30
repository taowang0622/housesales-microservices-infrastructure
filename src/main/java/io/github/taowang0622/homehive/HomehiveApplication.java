package io.github.taowang0622.homehive;

import com.github.taowang0622.homehive.autoconfig.EnableHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableHttpClient
public class HomehiveApplication {
	public static void main(String[] args) {
		SpringApplication.run(HomehiveApplication.class, args);
	}
}
