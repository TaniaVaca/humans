package co.com.mercadolibrer.humans.model.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.mercadolibrer.humans.core.Human;
import co.com.mercadolibrer.humans.model.Sequence;

@Service
@Transactional
public class GenomeServicioImpl implements GenomeServicio {

	@Autowired
	GenomeRepository sequenceRepositorio;

	@Override
	public boolean createSequence(Sequence sequence) {
		Human human = new Human(sequence.getDna());		Genome genome = new Genome();
		boolean isMutuant = human.isMutant();
		genome.setMutant(isMutuant);
		genome.setSequence(sequence);
		sequenceRepositorio.save(genome);
		return isMutuant;
	}

	@Override
	public String getStatusGenome() {
		String resp="0";
		double humans = (double)sequenceRepositorio.findAllHumans();
		double mutants = (double) sequenceRepositorio.findAllMutants();
		double ratio = (double) 0;
		if (mutants>0) {
			ratio = mutants/humans;
			resp=String.format("%.f", ratio);
		}
		System.out.println("GenomeServicioImpl.getStatusGenome()!!!! " + ratio);
		System.out.println("GenomeServicioImpl.getStatusGenome() " + resp);
		return " ADN: {“count_mutant_dna”: " + mutants + ", “count_human_dna”:" + humans + ": “ratio”:" + resp+ "}\r\n";
	}

}
