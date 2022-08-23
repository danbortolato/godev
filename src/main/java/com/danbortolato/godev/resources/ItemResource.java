package com.danbortolato.godev.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danbortolato.godev.entities.Item;
import com.danbortolato.godev.services.ItemService;

@RestController
@RequestMapping(value= "/items")
public class ItemResource {
	
	@Autowired
	private ItemService service;
	
	@GetMapping
	public ResponseEntity<List<Item>> findAll() {
		List<Item> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Item> findById(@PathVariable Long id) {
		Item obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
