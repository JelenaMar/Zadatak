package CriptoCurrency.service.implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CriptoCurrency.model.Item;
import CriptoCurrency.repository.ItemRepository;
import CriptoCurrency.service.ItemService;
@Service
@Transactional
public class JpaItemService implements ItemService{
	@Autowired
	private ItemRepository ir;

	@Override
	public List<Item> findAll() {
		
		return ir.findAll();
	}

	@Override
	public List<Item> save(List<Item> items) {
	
		return ir.save(items);
	}

	@Override
	public Item save(Item item) {
		
		return ir.save(item);
	}

}
