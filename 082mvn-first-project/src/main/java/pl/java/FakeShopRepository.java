package pl.java;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Repository;

@Repository
public class FakeShopRepository implements ShopRepository {
	private List<Shop> shops;
	
	public FakeShopRepository(ShopGenerator shopGenerator) {
		shops = shopGenerator.generate();
	}
	
	@Override
	public List<Shop> findAll() {
		return new ArrayList<>(shops);
	}
	
	@Override
	public Shop findOne(String name) {
		return shops
				.stream()
				.filter(shop -> Objects.equals(shop.getName(), name))
				.findFirst()
				.orElseGet(() -> null);
	}

	
}
