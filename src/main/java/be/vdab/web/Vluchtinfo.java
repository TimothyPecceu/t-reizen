package be.vdab.web;

import java.io.Serializable;

public class Vluchtinfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String vertrekLuchthavenCode;
	private String bestemmingsLuchthavenCode;
	private String datum;

	public Vluchtinfo() {
	}
	
	public Vluchtinfo(String vertrekLuchthavenCode, String bestemmingsLuchthavenCode, String datum) {
		this.vertrekLuchthavenCode = vertrekLuchthavenCode;
		this.bestemmingsLuchthavenCode = bestemmingsLuchthavenCode;
		this.datum = datum;
	}
	
	public String getVertrekLuchthavenCode() {
		return vertrekLuchthavenCode;
	}

	public void setVertrekLuchthavenCode(String vertrekLuchthavenCode) {
		this.vertrekLuchthavenCode = vertrekLuchthavenCode;
	}

	public String getBestemmingsLuchthavenCode() {
		return bestemmingsLuchthavenCode;
	}

	public void setBestemmingsLuchthavenCode(String bestemmingsLuchthavenCode) {
		this.bestemmingsLuchthavenCode = bestemmingsLuchthavenCode;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

}
