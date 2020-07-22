package microservice.core.advert.controller;

import java.util.List;

import microservice.core.advert.model.Pricelist;


public interface PricelistService {
	
	
	List<Pricelist> findAll();
	
	void save(Pricelist newpl);

	List<Pricelist> findByUser(Long id);

	void remove(Long id);

	Pricelist getPriceList(long priceList);

//	Pricelist findById(Pricelist advertsPriceList);
	
	
}
