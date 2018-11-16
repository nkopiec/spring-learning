package pl.java;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
	class ProductGenerate {
	    private static final String PRODUCT_NAMES_FILE_PATH = "productName";
	    private static final double PRICE_BASE = 1_000.0;
	    private static final double PRICE_SPREAD = 10_000.0;
	    private final FileLinesLoader fileLinesLoader;
	    private List<String> productName;
	    private List<String> productPrice;
	    private final Random random = new Random();

	    ProductGenerate(FileLinesLoader fileLinesLoader) {
	        this.fileLinesLoader = fileLinesLoader;
	    }

	    List<Product> generate(int numberOfProducts) {
	        return Stream
	                .generate(this::generate)
	                .limit(numberOfProducts)
	                .collect(Collectors.toList());
	    }

	    private Product generate() {
	        return new Product(
	        		getProductName(),
	        		getProductPrice()
	        );
	    }

	    private String getRandomProductName() {
	        return getRandom(getProductName());
	    }

	    private String getRandomProductPrice() {
	        return getRandom(getProductPrice());
	    }

	    private String getRandom(List<String> elements) {
	        return elements.get(
	                random.nextInt(
	                        elements.size()));
	    }

	    private List<String> getProductName() {
	        if (productName == null) {
	            productName = fileLinesLoader.loadLines(PRODUCT_NAMES_FILE_PATH);
	        }
	        return productName;
	    }

	    private List<String> getProductPrice() {
	        if (productPrice == null) {
	        	productPrice = fileLinesLoader.loadLines("productPrice");
	        }
	        return productPrice;
	    }

	}

