package pl.java;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("${urls.shop.root}")
@RestController
public class ShopController {
	 private final ShopRepository shopRepository;
	 
	 public ShopController(ShopRepository shopRepository) {
		 this.shopRepository = shopRepository;
	 }
	 
	 @GetMapping
	    List<Shop> findALl() {
	        return shopRepository.findAll();
	    }

	 @GetMapping("/{companyName}")
	    Shop findOne(@PathVariable("shopName") String name) {
	        return shopRepository.findOne(name);
	    }

	    @GetMapping("{shopName}/${urls.shop.products.root}/{productName}")
	    List<Product> findShopProductWithProductName(
	            @PathVariable String shopName,
	            @PathVariable("productName") String name) {
	        return findOne(shopName)
	                .getProducts()
	                .stream()
	                .filter(product -> Objects.equals(product.getProductName(), name))
	                .collect(Collectors.toList());
	    }

	    @GetMapping("{shopName}/${urls.shop.products.root}/{productProducent}/{productName}")
	    List<Product> findShopProductWithProductNameAndProductProducent(@PathVariable Map<String, String> pathVariable) {
	        return findOne(pathVariable.get("shopName"))
	                .getProducts()
	                .stream()
	                .filter(product -> Objects.equals(product.getProductName(), pathVariable.get("productName")))
	                .filter(product -> Objects.equals(product.getProductProducent(), pathVariable.get("productProducent")))
	                .collect(Collectors.toList());
	    }
}
