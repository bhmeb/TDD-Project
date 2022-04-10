package com.in28Minute.junitesting.unittesting.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {
	
	@Id
	private int id;
	private String name;
	private int price;
	private int quantity;
	
	@Transient
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public Item() {}  //If you not use default constructor, JPA error will occur

	public Item(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String toString() {
		return String.format("Item[%d,%s,%d,%d]", id, name, price, quantity);
	}
	

	/*private int id;
	private String name;
	private int price;
	private int quantity;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public Item(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String toString() {
		return String.format("Item[%d,%s,%d,%d]", id, name, price, quantity);
	}*/
}
