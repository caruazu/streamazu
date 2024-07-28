package com.example.stremazu;

import com.example.stremazu.service.ConsumeAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class StremazuApplication implements CommandLineRunner {

	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(StremazuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String apikey = environment.getProperty("api.omdb.key");
		var consumeAPI = new ConsumeAPI();
		String endereco = "https://www.omdbapi.com/?t=gilmore+girls&apikey="+apikey;
		var json = consumeAPI.obterDados(endereco);
		System.out.println(json);
	}
}
