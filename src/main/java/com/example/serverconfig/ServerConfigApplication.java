package com.example.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerConfigApplication {

//	@Value("${welcome.first}")
//	public String welcomeMsg;

	public static void main(String[] args) {
		SpringApplication.run(ServerConfigApplication.class, args);
	}
}
