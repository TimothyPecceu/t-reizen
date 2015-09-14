package be.vdab.web;

import java.util.Date;

class Vluchtinfo {
	private String vertrekLuchthavenCode;
	private String bestemmingsLuchthavenCode;
	private Date datum;

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

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

}
