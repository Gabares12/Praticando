package com.estudos.anotacoes.exemplos;

import lombok.ToString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ExemplosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExemplosApplication.class, args);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("joao");
        pessoa.setSobrenome("Silva");
        pessoa.setIdade(23);
        System.out.println("nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("idade: " + pessoa.getIdade());
        System.out.println("Data: " + pessoa.getLocalDate());

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Valdir");
        pessoa1.setSobrenome("Emalhdy");
        pessoa1.setIdade(44);
        pessoa1.setLocalDate();


    }

    @Override
    public void run(String... args) throws Exception {
    }
}
