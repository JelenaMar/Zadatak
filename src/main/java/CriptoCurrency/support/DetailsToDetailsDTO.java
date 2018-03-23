package CriptoCurrency.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import CriptoCurrency.model.Details;
import CriptoCurrency.web.dto.DetailsDTO;

@Component
public class DetailsToDetailsDTO implements Converter<Details,DetailsDTO>{

	@Override
	public DetailsDTO convert(Details source) {
		DetailsDTO dto= new DetailsDTO();
		dto.setId(source.getId());
		dto.setName(source.getName());
		dto.setRank(source.getRank());
		dto.setPriceInUsd(source.getPriceInUsd());
		dto.setPriceInbitcoin(source.getPriceInbitcoin());
		dto.setDayvolume(source.getDayvolume());
		dto.setMarketcup(source.getMarketcup());
		dto.setAvailableSupply(source.getAvailableSupply());
		dto.setTotalSupply(source.getTotalSupply());
		dto.setOneHchange(source.getOneHchange());
		dto.setDaychange(source.getDaychange());
		dto.setSevenDchange(source.getSevenDchange());
		dto.setItemId(source.getItem().getId());
		
		
		return dto;
		
	}
	public List<DetailsDTO> convert(List<Details> details){
		List<DetailsDTO>dtos= new ArrayList<>();
		for(Details d:details) {
			dtos.add(convert(d));
		}
		return dtos;
	}
	
	
	

}
