package co.com.mercadolibrer.humans.model.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.mercadolibrer.humans.core.Human;
import co.com.mercadolibrer.humans.model.SequenceDTO;

@Service
@Transactional
public class SequenceServicioImpl implements SequenceServicio {

	@Autowired
	SequenceRepository sequenceRepositorio;

	@Override
	public boolean createSequence(SequenceDTO sequenceDto) {
		Human human = new Human(sequenceDto.getDna());		
		Sequence sequence = new Sequence();
		boolean isMutuant = human.isMutant();
		sequence.setMutant(isMutuant);
		sequence.setAdn(sequenceDto);
		sequenceRepositorio.save(sequence);
		return isMutuant;
	}

	@Override
	public String getStatusSequence() {
		String resp="0";
		int humans = sequenceRepositorio.findAllHumans();
		int mutants = sequenceRepositorio.findAllMutants();
		double ratio = (double) 0;
		if (mutants>0) {
			ratio = (double)mutants/(double)humans;
			resp=String.format("%,f", ratio);
		}
		return " ADN: {count_mutant_dna: " + mutants + ", count_human_dna: " + humans + ", ratio: " + resp+ "}\r\n";
	}

}
