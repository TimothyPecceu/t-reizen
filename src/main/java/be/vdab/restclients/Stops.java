package be.vdab.restclients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Stops {
	@XmlElement(name="StopQuantity")
	int quantity;

	public int getQuantity() {
		return quantity;
	}
}
