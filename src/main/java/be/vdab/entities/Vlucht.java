package be.vdab.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="vluchten")
public class Vlucht implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	@JoinColumn(name="vanluchthaven")
	private Luchthaven vanLuchthaven;
	@ManyToOne
	@JoinColumn(name="naarluchthaven")
	private Luchthaven naarLuchthaven;
	@ManyToOne
	@JoinColumn(name="maatschappij")
	private Maatschappij maatschappij;
	private String vluchtnr;
}
