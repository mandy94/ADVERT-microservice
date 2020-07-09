package microservice.core.advert.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.core.advert.model.additions.City;


@Repository
public interface CityRepository extends JpaRepository<City, Long> {
	
	
}
