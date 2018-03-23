package CriptoCurrency.service;

import java.util.List;

import CriptoCurrency.model.Item;

public interface ItemService {
	
	List<Item> findAll();
	Item save (Item item);
	List<Item> save (List<Item>items);

}
