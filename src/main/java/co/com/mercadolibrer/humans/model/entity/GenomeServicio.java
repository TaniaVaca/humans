package co.com.mercadolibrer.humans.model.entity;

import java.util.List;

import co.com.mercadolibrer.humans.model.Sequence;

public interface GenomeServicio {

	public boolean createSequence(Sequence sequence);
    public String getStatusGenome();
 
}
