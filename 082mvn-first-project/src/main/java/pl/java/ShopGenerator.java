package pl.java;


	import java.util.List;
	import java.util.Random;
	import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

	@Service
	class ShopGenerator {
	    private static final int MAX_NUMBER_OF_SHOP_MINUS_ONE = 5;
	    private static final int MIN_NUMBER_OF_SHOP = 1;
	    private static final int MIN_NUMBER_OF_PRODUCTS = 1;
	    private static final int MAX_NUMBER_OF_PRODUCTS_MINUS_ONE = 10;
	    private final FileLinesLoader fileLinesLoader;
	    private final ProductGenerate productGenerator;
	    private static final Random random = new Random();

	    public ShopGenerator(FileLinesLoader fileLinesLoader, ProductGenerate productGenerator) {
	        this.fileLinesLoader = fileLinesLoader;
	        this.productGenerator = productGenerator;
	    }

	    List<Shop> generate() {
	        return fileLinesLoader
	                .loadLinesShuffled("shops")
	                .stream()
	                .limit(randomNumberOfShops())
	                .map(this::generateShop)
	                .collect(Collectors.toList());
	    }

	    private Shop generateShop(String name) {
	        return new Shop(name, generateProducts());
	    }

	    private List<Product> generateProducts() {
	        return  productGenerator.generate(randomNumberOfProducts());
	    }

	    private int randomNumberOfProducts() {
	        return MIN_NUMBER_OF_PRODUCTS + random.nextInt(MAX_NUMBER_OF_PRODUCTS_MINUS_ONE);
	    }

	    private long randomNumberOfShops() {
	        return MIN_NUMBER_OF_SHOP + random.nextInt(MAX_NUMBER_OF_SHOP_MINUS_ONE);
	    }
	    
	    private String generateName() {
	    	return null;
	    }

	
}
