package co.com.mercadolibrer.humans.model.entity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface GenomeRepository extends CrudRepository<Genome, Long>{

	@Query("select COUNT(*) AS mutuant from genome g where g.mutant=1")
	int findAllMutants();
	@Query("select COUNT(*) from genome g")
	int findAllHumans();
}
