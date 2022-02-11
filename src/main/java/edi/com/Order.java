package edi.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order",
propOrder = { "buyerOrderNumber", 
		"buyerOrderDate"
})
public class Order {

	@XmlElement(name = "BuyerOrderNumber", required = true)
	protected String buyerOrderNumber;
	@XmlElement(name = "BuyerOrderDate", required = true)
	protected String buyerOrderDate;
	
	public void setBuyerOrderNumber(String string) {
		this.buyerOrderNumber = string;
	}

	public void setBuyerOrderDate(String value) {
		this.buyerOrderDate = value;
	}

}
