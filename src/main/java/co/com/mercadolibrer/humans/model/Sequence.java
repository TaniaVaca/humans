package co.com.mercadolibrer.humans.model;

import java.io.Serializable;

public class Sequence implements Serializable{

	public String [] dna;

	public Sequence() {
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
