package CriptoCurrency.service.implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CriptoCurrency.model.Details;
import CriptoCurrency.repository.DetailsRepository;
import CriptoCurrency.service.DetailsService;

@Service
@Transactional
public class JpaDetailsService implements DetailsService {
	@Autowired
	private DetailsRepository dr;

	@Override
	public Details findByItemId(Long itemId) {
		
		return dr.findByItemId(itemId) ;
	}

	@Override
	public Details save(Details details) {
		
		return dr.save(details);
	}

	@Override
	public List<Details> findAll() {
		
		return dr.findAll();
	}

}
