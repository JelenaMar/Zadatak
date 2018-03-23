package CriptoCurrency.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import CriptoCurrency.model.Details;
import CriptoCurrency.service.DetailsService;
import CriptoCurrency.support.DetailsToDetailsDTO;
import CriptoCurrency.web.dto.DetailsDTO;

@RestController
@RequestMapping("/api/details")
public class DetailsController {
	@Autowired
	private DetailsService ds;
	@Autowired
	private DetailsToDetailsDTO dto;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<DetailsDTO>>getAll(){
		List<Details> details = ds.findAll();
		if(details== null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(dto.convert(details),HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{itemId}")
	public ResponseEntity<DetailsDTO> detailsforItem(
			@PathVariable Long itemId){
		    Details details = ds.findByItemId(itemId);
	
		return  new ResponseEntity<>(
			 dto.convert(details),
				HttpStatus.OK);
	}


}
