package com.danbortolato.godev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danbortolato.godev.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
