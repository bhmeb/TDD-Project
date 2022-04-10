package com.in28Minute.junitesting.unittesting.spring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in28Minute.junitesting.unittesting.spring.model.Item;
import com.in28Minute.junitesting.unittesting.spring.repository.ItemRepository;

@ExtendWith(MockitoExtension.class)
class ItemBusinessServiceTest {

	@InjectMocks
	ItemBusinessService itemBusinessService;

	@Mock
	ItemRepository itemRepository;

	@Test
	void itemBusinessService_basic() {
		when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(2,"Item2",10,10),
				  new Item(3,"Item3",20,20),new Item(4,"Item4",30,30)));
		List<Item> items = itemBusinessService.retrieveAllItems();
		assertEquals(100,items.get(0).getValue());
		assertEquals(400,items.get(1).getValue());
		assertEquals(900,items.get(2).getValue());
	}

}
