package CriptoCurrency.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CriptoCurrency.model.Details;

@Repository
public interface DetailsRepository extends JpaRepository <Details,Long>{

	Details findByItemId( Long itemId);
}
