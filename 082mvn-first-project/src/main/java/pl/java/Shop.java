package pl.java;

import java.util.List;

public class Shop {
	private String name;
	private List<Product> products;
	 
	public Shop(String name, List<Product> products) {
		this.name = name;
		this.products = products;
	}
	public String getName() {
		return name;
	}
	
	public List<Product> getProducts() {
		return products;
	}
}
