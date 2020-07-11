package microservice.core.advert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import microservice.core.advert.model.Bonus;

@Repository
public interface BonusRepository extends JpaRepository<Bonus, Long> {

	@Query("Select u from Bonus u where u.creator = :id")
	List<Bonus> findByCreator(@Param("id") Long id); 

}
