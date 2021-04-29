package co.com.mercadolibrer.humans.model;

import java.io.Serializable;

public class SequenceDTO implements Serializable{

	public String [] dna;

	public SequenceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String[] getDna() {
		return dna;
	}

	public void setDna(String[] dna) {
		this.dna = dna;
	}

}
