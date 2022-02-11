package edi.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reference", 
propOrder = { "invoiceReferenceNumber", 
		"invoiceReferenceDate" })
public class Reference {

	@XmlElement(name = "InvoiceReferenceNumber", required = true)
	protected String invoiceReferenceNumber;
	@XmlElement(name = "InvoiceReferenceDate", required = true)
	protected String invoiceReferenceDate;

	public void setInvoiceReferenceNumber(String string) {
		this.invoiceReferenceNumber = string;
	}

	public void setInvoiceReferenceDate(String value) {
		this.invoiceReferenceDate = value;
	}

}
