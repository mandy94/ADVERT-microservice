package microservice.core.advert.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import microservice.core.advert.model.Advert;


@Repository
public interface Advertrepository extends JpaRepository<Advert, Long> {
	
	@Query("SELECT a FROM Advert a WHERE a.user_id = :user")
	List<Advert> findAll(@Param("user") Long user);
	
	
}
