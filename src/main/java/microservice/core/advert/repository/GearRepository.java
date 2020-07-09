package microservice.core.advert.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.core.advert.model.additions.GearBoxType;
import microservice.core.advert.model.additions.Model;


@Repository
public interface GearRepository extends JpaRepository<GearBoxType, Long> {
	
	
}
