package co.com.mercadolibrer.humans.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.com.mercadolibrer.humans.core.Human;
import co.com.mercadolibrer.humans.model.SequenceDTO;
import co.com.mercadolibrer.humans.model.entity.SequenceRepository;
import co.com.mercadolibrer.humans.model.entity.SequenceServicio;
import co.com.mercadolibrer.humans.model.entity.SequenceServicioImpl;

@RestController
public class HumanController {

	@Autowired
	SequenceServicio sequenceServicio;
	
	@PostMapping(value="/mutant",consumes = "application/json", produces = "application/json")
	public SequenceDTO mutant(@RequestBody SequenceDTO dna) {
		boolean isMutant = sequenceServicio.createSequence(dna);
		if (!isMutant) {
			throw new ForbiddenException();
		}
		return dna;
	}
	
	@GetMapping("/stats")
	public String mutant2() {
		String resp = sequenceServicio.getStatusSequence();
		return resp;
	}
}

@ResponseStatus(value = HttpStatus.FORBIDDEN)
class ForbiddenException extends RuntimeException {
	
}