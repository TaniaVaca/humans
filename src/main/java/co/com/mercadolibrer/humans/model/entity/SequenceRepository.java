package co.com.mercadolibrer.humans.model.entity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SequenceRepository extends CrudRepository<Sequence, Long>{

	@Query("select COUNT(*) AS mutuant from sequence g where g.mutant=1")
	int findAllMutants();
	@Query("select COUNT(*) from sequence g")
	int findAllHumans();
}
