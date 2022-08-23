package com.danbortolato.godev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danbortolato.godev.entities.Item;
import com.danbortolato.godev.repositories.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository repository;
	
	public List<Item> findAll() {
		return repository.findAll();
	}
	
	public Item findById(Long id) {
		Optional<Item> obj = repository.findById(id);
		return obj.get();
	}

}
