import org.junit.Assert;
import org.junit.Test;

import CriptoCurrency.model.Details;
import CriptoCurrency.service.DetailsService;


public class MetodeTest {
	
	private DetailsService ds;

	@Test
	public void testFindOneById() {
		Details detail = ds.findByItemId(1L);
		Assert.assertNotNull(detail);
		Assert.assertEquals("BTC", detail.getSymbol());
	}
}
