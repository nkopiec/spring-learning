package pl.java;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
	class ProductGenerate {
	    private static final String PRODUCT_NAMES_FILE_PATH = "productNames";
	    private static final double PRICE_BASE = 1_000.0;
	    private static final double PRICE_SPREAD = 10_000.0;
	    private final FileLinesLoader fileLinesLoader;
	    private List<String> productNames;
	    private List<String> productProducents;
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
	        		getRandomProductName(),
	        		getRandomProductProducent(),
	        		getRandomProductPrice()
	        	);
	    }

	    private String getRandomProductName() {
	        return getRandom(getProductNames());
	    }
	    
	    private String getRandomProductProducent() {
	    	return getRandom(getProductProducents());
	    }


	    private String getRandom(List<String> elements) {
	        return elements.get(
	                random.nextInt(
	                        elements.size()));
	    }

	    private List<String> getProductNames() {
	        if (productNames == null) {
	            productNames = fileLinesLoader.loadLines(PRODUCT_NAMES_FILE_PATH);
	        }
	        return productNames;
	    }

	    private List<String> getProductProducents() {
	        if (productProducents == null) {
	        	productProducents = fileLinesLoader.loadLines("productProducents");
	        }
	        return productProducents;
	    }
	    
	    private BigDecimal getRandomProductPrice() {
	        return new BigDecimal(PRICE_BASE + Math.random() * PRICE_SPREAD);
	    }

	}

