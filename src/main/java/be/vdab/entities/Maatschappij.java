package be.vdab.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maatschappijen")
public class Maatschappij implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String code;
	private String naam;
}
