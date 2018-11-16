package pl.java;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("product")
@RestController
public class ProductsControllers {
//	@RequestMapping(value = "get-product", method = RequestMethod.POST)
	@PostMapping("get-product") //zamiennik 
	public @ResponseBody List<Product> getProduct() {
		List<Product> result = new ArrayList<>();
		
		result.add(new Product("Book ", 23.5));
		result.add(new Product("Pen ", 1.8));
		result.add(new Product("Coat ", 256.0));
		
		return result;
	}
//	@RequestMapping(value = "find-any", method = RequestMethod.GET)
	@GetMapping("find-any") //zamiennik
	public Product findAny() {
		return new Product("Book ", 23.5);
	}
}
