package CriptoCurrency.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import CriptoCurrency.model.Item;
import CriptoCurrency.web.dto.ItemDTO;
@Component
public class ItemtoItemDTO implements Converter<Item,ItemDTO> {

	@Override
	public ItemDTO convert(Item source) {
	    ItemDTO dto = new ItemDTO();
	    
	    dto.setId(source.getId());
	    dto.setRank(source.getRank());
	    dto.setSymbol(source.getSymbol());
	    dto.setPrice(source.getPrice());
	    dto.setDaychange(source.getDaychange());
	    
	    
		return dto;
	}
	
	public List<ItemDTO> convert(List<Item>items){
		
		List<ItemDTO> dtos = new ArrayList<>();
		for(Item i:items) {
			dtos.add(convert(i));
		}
		return dtos;
	}

}
