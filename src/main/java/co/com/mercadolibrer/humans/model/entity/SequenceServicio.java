package co.com.mercadolibrer.humans.model.entity;

import java.util.List;

import co.com.mercadolibrer.humans.model.SequenceDTO;

public interface SequenceServicio {

	public boolean createSequence(SequenceDTO sequenceDTO);
    public String getStatusSequence();
 
}
