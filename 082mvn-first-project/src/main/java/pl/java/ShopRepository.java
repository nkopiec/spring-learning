package pl.java;

import java.util.List;

interface ShopRepository {
	List<Shop> findAll();
		Shop findOne(String name);
}
