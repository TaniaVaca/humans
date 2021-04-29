package co.com.mercadolibrer.humans.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.type.BinaryType;
import org.hibernate.type.StringType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import co.com.mercadolibrer.humans.model.SequenceDTO;


@Entity(name = "sequence")
@Table(name = "sequence")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Sequence implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator = "native")
	@GenericGenerator(name="native",strategy ="native")
	@Column(name="id")
    private Integer id;
	
//	@Column(name = "sequence", columnDefinition = "json")
//	@JsonFormat(shape = JsonFormat.Shape.OBJECT)
//	@Type(type = "json")
//	@Column(name = "sequence",columnDefinition = "json")
	
//	@Type(type = "json")
//    @Column(columnDefinition = "json")
//	private Sequence sequence;
	@Type( type = "json" )
	@Column(name = "adn", columnDefinition = "json" )
	private SequenceDTO adn;
	
	@Column(name = "mutant")
	private boolean mutant;

	public Sequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SequenceDTO getAdn() {
		return adn;
	}

	public void setAdn(SequenceDTO adn) {
		this.adn = adn;
	}

	public boolean isMutant() {
		return mutant;
	}

	public void setMutant(boolean mutant) {
		this.mutant = mutant;
	}
}
