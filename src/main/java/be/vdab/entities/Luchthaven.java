package be.vdab.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "luchthavens")
public class Luchthaven implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;
	@ManyToOne
	@JoinColumn(name = "landcode")
	private Land land;
	@ManyToOne
	@JoinColumn(name = "stadid")
	private Stad stad;
	private String naam;

	public String getCode() {
		return code;
	}

	public Land getLand() {
		return land;
	}

	public Stad getStad() {
		return stad;
	}

	public String getNaam() {
		return naam;
	}
}
