package microservice.core.advert.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

import microservice.core.advert.model.Advert;
import microservice.core.advert.model.Bonus;
import microservice.core.advert.model.Pricelist;


public interface AdvertService {
	List<Advert> findAll(Long user) throws AccessDeniedException;
	List<Advert> findAllAds();
	Advert getAdById(Long id);
	void save(Advert ad);
	void removeById(Long id);
	Pricelist getAdvertsPriceList(Long id);
}
