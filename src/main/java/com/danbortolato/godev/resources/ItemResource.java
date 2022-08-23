package com.danbortolato.godev.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danbortolato.godev.entities.Item;

@RestController
@RequestMapping(value= "/items")
public class ItemResource {
	
	@GetMapping
	public ResponseEntity<Item> findAll() {
		Item u = new Item(1L, "Descrip1", 99.90, 'P');
		return ResponseEntity.ok().body(u);
	}
}
