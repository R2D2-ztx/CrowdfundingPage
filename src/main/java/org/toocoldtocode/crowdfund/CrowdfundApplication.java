package org.toocoldtocode.crowdfund;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrowdfundApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrowdfundApplication.class, args);
	}

}
