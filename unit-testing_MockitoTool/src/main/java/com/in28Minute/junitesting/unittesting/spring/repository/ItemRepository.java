package com.in28Minute.junitesting.unittesting.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28Minute.junitesting.unittesting.spring.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
