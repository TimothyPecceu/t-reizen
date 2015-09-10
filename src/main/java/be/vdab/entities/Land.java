package be.vdab.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "landen")
public class Land implements Serializable {
	private final static long serialVersionUID = 1L;
	
	@Id
	private String code;
	private String naam;
	private String zone;
	
	public String getCode() {
		return code;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public String getZone() {
		return zone;
	}
	
}
