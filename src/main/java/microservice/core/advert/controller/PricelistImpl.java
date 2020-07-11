package microservice.core.advert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microservice.core.advert.model.Pricelist;
import microservice.core.advert.repository.PricelistRepository;



@Service
public class PricelistImpl implements PricelistService {

    @Autowired
    private PricelistRepository priceListRepository;


	@Override
	public void save(Pricelist newpl) {
			priceListRepository.save(newpl);		
	}

	@Override
	public List<Pricelist> findByUser(Long id) {
		return priceListRepository.getByUser(id);
	}

	@Override
	public void remove(Long id) {
		priceListRepository.deleteById(id);
		
	}

	@Override
	public List<Pricelist> findAll() {
		System.out.println(" Unutar serviza");
		return priceListRepository.findAll();
	}

	@Override
	public Pricelist getPriceList(long priceList) {
		return priceListRepository.findById(priceList).orElse(null);
	}
    
  


}
