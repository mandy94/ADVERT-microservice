package microservice.core.advert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import microservice.core.advert.model.Pricelist;

@Repository
public interface PricelistRepository extends JpaRepository<Pricelist, Long> {

	@Query("Select x from Pricelist x where x.creator.id = :id ")   // where r.owner = id  
	List<Pricelist> getByUser(@Param("id") Long id);

}

