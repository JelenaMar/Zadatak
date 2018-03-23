package CriptoCurrency;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import CriptoCurrency.model.Details;
import CriptoCurrency.model.Item;
import CriptoCurrency.service.DetailsService;
import CriptoCurrency.service.ItemService;

@Component
public class TestData {
	@Autowired
	private ItemService is;
	@Autowired
    private DetailsService ds;
	
	@PostConstruct
	public void init() {
		
		Item i1= new Item();
		i1.setId(1L);
		i1.setRank(1);
		i1.setSymbol("BTC");
		i1.setPrice(573.137);
		i1.setDaychange(-0.3);
		is.save(i1);
		
		Details d1 = new Details();
		d1.setId(1L);
		d1.setName("Bitcoin");
		d1.setSymbol("BTC");
		d1.setRank(1);
		d1.setPriceInUsd(573.173);
		d1.setPriceInbitcoin(1.0);
		d1.setDayvolume(72855700.0);
		d1.setMarketcup(9080883500.0);
		d1.setAvailableSupply(15844176.0);
		d1.setTotalSupply(15844176.0);
		d1.setOneHchange(0.04);
		d1.setDaychange(-0.3);
		d1.setSevenDchange(-0.57);
		d1.setItem(i1);
	    ds.save(d1);
	    
	    Item i2= new Item();
		i2.setId(2L);
		i2.setSymbol("ETH");
		i2.setRank(2);
		i2.setPrice(12.1844);
		i2.setDaychange(6.34);
		is.save(i2);
		
		Details d2 = new Details();
		d2.setId(2L);
		d2.setName("Ethereum");
		d2.setSymbol("ETH");
		d2.setRank(2);
		d2.setPriceInUsd(12.1844);
		d2.setPriceInbitcoin(0.02162);
		d2.setDayvolume(2085900.0);
		d2.setMarketcup(1018098455.0);
		d2.setAvailableSupply(83557537.0);
		d2.setTotalSupply(83557537.0);
		d2.setOneHchange(-0.58);
		d2.setDaychange(6.34);
		d2.setSevenDchange(8.59);
		d2.setItem(i2);
	    ds.save(d2);
	   
	    
		Item i3 = new Item();
		i3.setId(3L);
		i3.setSymbol("XRP");
		i3.setRank(3);
		i3.setPrice(0.66562);
		i3.setDaychange(-6.26);
		is.save(i3);

		Details d3 = new Details();
		d3.setId(3L);
		d3.setName("Ripple");
		d3.setSymbol("XRP");
		d3.setRank(3);
		d3.setPriceInUsd(0.66562);
		d3.setPriceInbitcoin(0.00007629);
		d3.setDayvolume(446401000.0);
		d3.setMarketcup(26021811407.0);
		d3.setAvailableSupply(26021811407.0);
		d3.setTotalSupply(99992466986.0);
		d3.setOneHchange(-0.93);
		d3.setDaychange(-6.26);
		d3.setSevenDchange(-3.62);
		d3.setItem(i3);
	    ds.save(d3);
	    
	
		
		
		
		
		
	}
	 
}
