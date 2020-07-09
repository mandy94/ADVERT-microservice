package microservice.core.advert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.core.advert.model.additions.Fuel;


@Repository
public interface FuelRepository extends JpaRepository<Fuel, Long> {
	
	
}
