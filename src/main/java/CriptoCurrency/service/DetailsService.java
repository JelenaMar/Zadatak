package CriptoCurrency.service;

import java.util.List;

import CriptoCurrency.model.Details;

public interface DetailsService {
	Details findByItemId(Long itemId);
	List<Details> findAll();
    Details save (Details details);
}
