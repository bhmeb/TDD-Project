package com.in28Minute.junitesting.unittesting.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28Minute.junitesting.unittesting.spring.model.Item;
import com.in28Minute.junitesting.unittesting.spring.repository.ItemRepository;

@Component
public class ItemBusinessService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public Item retrieveHardCodedItem() {
		return new Item(1, "Ball", 10, 100);
	}
	
	public List<Item> retrieveAllItems(){
		List<Item> items = itemRepository.findAll();
		for(Item item:items) {
			item.setValue(item.getPrice()*item.getQuantity());
		}
		return items;
	}

}
