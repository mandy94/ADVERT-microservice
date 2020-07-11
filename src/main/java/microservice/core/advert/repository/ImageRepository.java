package microservice.core.advert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.core.advert.model.Image;


@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

	Image findByName(String imageName);

//	@Query("Select i from Image i where i.name LIKE ")
	List<Image> findByNameContaining(String imageName);
	
	
}
