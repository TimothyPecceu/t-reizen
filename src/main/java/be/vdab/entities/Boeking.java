package be.vdab.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="boekingen")
public class Boeking implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	@JoinColumn(name="vertrekvlucht")
	private Vlucht vertrekVlucht;
	@ManyToOne
	@JoinColumn(name="retourvlucht")
	private Vlucht retourVlucht;
	private int volwassenen;
	private int kinderen;
}
