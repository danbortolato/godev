package com.danbortolato.godev.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.danbortolato.godev.entities.Item;
import com.danbortolato.godev.repositories.ItemRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Item u1 = new Item(null, "Descrip1", 99.90, 'P');
		Item u2 = new Item(null, "Descrip2", 77.70, 'S');
		
		itemRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
