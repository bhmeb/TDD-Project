package com.in28Minute.junitesting.unittesting.spring.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.in28Minute.junitesting.unittesting.spring.model.Item;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class ItemRepositoryTest {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Test
	public void testFindAll() {
		
	 List<Item> items = itemRepository.findAll();
	 
	 assertEquals(3, items.size());
		
	}

}

//Not working this test
