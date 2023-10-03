package com.nodebounty;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nodebounty.domain.cartao.Cartao;
import com.nodebounty.domain.cartao.CartaoRepository;
import com.nodebounty.domain.plano.Plano;
import com.nodebounty.domain.plano.PlanoRepository;

@Configuration
public class LoadDatabase {

	@Autowired
	CartaoRepository repositoryCartao;
	@Autowired
	PlanoRepository repositoryPlanos;

	@Bean
	CommandLineRunner initDatabase(PlanoRepository repository) {
		return args -> {
			// Salvando planos para testes
			Plano Beauty = new Plano("Beauty", 5.00, "MAC, MakeB, Vult");
			Plano Tech = new Plano("Tech", 5.00, "KaBum, Pichau, TeraByte Shop");
			Plano Health = new Plano("Health", 5.00, "Growth, OficialFarma, Drogasil");

			repositoryPlanos.saveAll(Arrays.asList(Beauty, Tech, Health));

			// Salvando cartões para teste
			LocalDate validade1 = LocalDate.of(2023, 12, 31);
			LocalDate validade2 = LocalDate.of(2024, 6, 30);
			LocalDate validade3 = LocalDate.of(2024, 9, 15);

			Cartao cartao1 = new Cartao(null, "João Silva", validade1, "1234567890123456", (short) 123, Health);
			Cartao cartao2 = new Cartao(null, "Maria Souza", validade2, "9876543210987654", (short) 456, Tech);
			Cartao cartao3 = new Cartao(null, "José Pereira", validade3, "5555666677778888", (short) 789, Beauty);

			repositoryCartao.saveAll(Arrays.asList(cartao1, cartao2, cartao3));

		};
	}

}