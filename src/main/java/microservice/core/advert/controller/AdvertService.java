package microservice.core.advert.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

import microservice.core.advert.model.Advert;


public interface AdvertService {
	List<Advert> findAll(Long user) throws AccessDeniedException;
	List<Advert> findAllAds();
	Advert getAdById(Long id);
	void save(Advert ad);
	void removeById(Long id);
}
