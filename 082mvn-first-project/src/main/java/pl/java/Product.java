package pl.java;

import java.math.BigDecimal;
import java.util.List;

public class Product {
	private Long id;
	private String productName;
	private String productProducent;
	private BigDecimal productPrice;
	
	Product(String productName, String productProducent, BigDecimal productPrice) {
		super();
		this.productName = productName;
		this.productProducent = productProducent;
		this.productPrice = productPrice;
	}
	
	public Long getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	
	public String getProductProducent() {
		return productProducent;
	}
	
	public BigDecimal getProductPrice() {
		return productPrice;
	}
}
