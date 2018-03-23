package CriptoCurrency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CriptoCurrencyApplication {
	@Autowired
	private TestData td;
	
	public static void main(String []args) {
	
	
	SpringApplication.run(CriptoCurrencyApplication.class,args);
	}
}
