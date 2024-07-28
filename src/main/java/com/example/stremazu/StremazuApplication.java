package com.example.stremazu;

import com.example.stremazu.service.ConsumeAPI;
import com.example.stremazu.service.ConverteDados;
import com.example.stremazu.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
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
		String endereco = "https://www.omdbapi.com/?t=gilmore+girls&apikey="+apikey;

		var consumeAPI = new ConsumeAPI();
		var json = consumeAPI.obterDados(endereco);

		ConverteDados conversor = new ConverteDados();
		Serie gilmoreGirl = conversor.obterDados(json, Serie.class);
		System.out.println(gilmoreGirl);
	}
}
