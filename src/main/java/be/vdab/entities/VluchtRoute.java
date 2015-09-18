package be.vdab.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vluchtroutes")
public class VluchtRoute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	long id;
	@Temporal(TemporalType.DATE)
	Date datum;
	String duur;
	@ManyToOne
	@JoinColumn(name = "vertrekluchthaven")
	Luchthaven vertrekluchthaven;
	@ManyToOne
	@JoinColumn(name = "eindluchthaven")
	Luchthaven eindluchthaven;
	@ManyToMany
	@JoinTable(name = "vluchtenperroute", joinColumns = @JoinColumn(name = "routeid") , inverseJoinColumns = @JoinColumn(name = "vluchtid") )
	Set<Vlucht> vluchten;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDatum() {
		return (Date) datum.clone();
	}

	public void setDatum(Date datum) {
		this.datum = (Date) datum.clone();
	}

	public String getDuur() {
		return duur;
	}

	public void setDuur(String duur) {
		this.duur = duur;
	}

	public Luchthaven getVertrekluchthaven() {
		return vertrekluchthaven;
	}

	public void setVertrekluchthaven(Luchthaven vertrekluchthaven) {
		this.vertrekluchthaven = vertrekluchthaven;
	}

	public Luchthaven getEindluchthaven() {
		return eindluchthaven;
	}

	public void setEindluchthaven(Luchthaven eindluchthaven) {
		this.eindluchthaven = eindluchthaven;
	}

	public Set<Vlucht> getVluchten() {
		return vluchten;
	}

	public void setVluchten(Set<Vlucht> vluchten) {
		this.vluchten = vluchten;
	}

}
