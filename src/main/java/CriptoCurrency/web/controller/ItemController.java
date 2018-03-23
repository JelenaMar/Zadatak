package CriptoCurrency.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import CriptoCurrency.model.Item;
import CriptoCurrency.service.ItemService;
import CriptoCurrency.support.ItemtoItemDTO;
import CriptoCurrency.web.dto.ItemDTO;



@RestController
@RequestMapping("/api/coinmarket")
public class ItemController {
	
	@Autowired
	private ItemService is;
	@Autowired
	private ItemtoItemDTO todto;

	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<ItemDTO>>getAll(){
		List<Item> items = is.findAll();
		
		if(items==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(todto.convert(items),HttpStatus.OK);
	}


}
