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
import co.com.mercadolibrer.humans.model.Sequence;
import co.com.mercadolibrer.humans.model.entity.GenomeRepository;
import co.com.mercadolibrer.humans.model.entity.GenomeServicio;
import co.com.mercadolibrer.humans.model.entity.GenomeServicioImpl;

@RestController
public class HumanController {

	@Autowired
	GenomeServicio genomeServicio;
	
	@PostMapping(value="/mutant",consumes = "application/json", produces = "application/json")
	public Sequence mutant(@RequestBody Sequence dna) {
		System.out.println("HumanController.mutant()!!!!!!!!!!!!!!!!!!!!!!!!!!$#$#$#$##$");
		boolean isMutant = genomeServicio.createSequence(dna);
		if (!isMutant) {
			throw new ForbiddenException();
		}
		return dna;
	}
	
	@GetMapping("/stats")
	public String mutant2() {
		String resp = genomeServicio.getStatusGenome();
		return resp;
	}
}

@ResponseStatus(value = HttpStatus.FORBIDDEN)
class ForbiddenException extends RuntimeException {
	
}