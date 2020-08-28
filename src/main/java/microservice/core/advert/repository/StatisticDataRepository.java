package microservice.core.advert.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.core.advert.model.StatisticData;

@Repository
public interface StatisticDataRepository extends JpaRepository<StatisticData, Long> {


	
	
}
