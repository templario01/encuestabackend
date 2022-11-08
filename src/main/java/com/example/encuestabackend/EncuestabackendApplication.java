package com.example.encuestabackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EncuestabackendApplication {
	@Autowired
    public EncuestabackendApplication(@Value("${server.port}") String port) {
        System.out.println("SERVER RUNNING ON PORT: ${port} "+port);
    }

	public static void main(String[] args) {
		SpringApplication.run(EncuestabackendApplication.class, args);
	}

}
