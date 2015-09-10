package be.vdab.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "steden")
public class Stad implements Serializable {
	private final static long serialVersionUID = 1L;
	@GeneratedValue
	@Id
	private long id;
	private String naam;
	private String stadCode;
	@ManyToOne
	@JoinColumn(name="landCode")
	private Land land;
	private String postcode;

	public long getId() {
		return id;
	}

	public String getNaam() {
		return naam;
	}

	public String getStadCode() {
		return stadCode;
	}

	public Land getLand() {
		return land;
	}

	public String getPostcode() {
		return postcode;
	}

}
