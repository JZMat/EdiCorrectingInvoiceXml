package edi.com;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "line-item", propOrder = { "lineNumber", "ean",
//    "itemDescription",
		"quantity", "invoiceUnitNetPrice", "taxRate", "taxAmount", "netAmount", 
		"previousQuantity", "previousInvoiceUnitNetPrice", "previousTaxRate", "previousTaxAmount", "previousNetAmount", 
		"correctionQuantity", "correctionInvoiceUnitNetPrice", "correctionTaxAmount", "correctionNetAmount"
})
public class LineItem {

	@XmlElement(name = "LineNumber", required = true)
	protected Integer lineNumber;
	@XmlElement(name = "EAN", required = true)
	protected String ean;
	@XmlElement(name = "InvoiceQuantity", required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger quantity;
//    @XmlElement(name = "ItemDescription", required = true)
//    protected String itemDescription;
	@XmlElement(name = "InvoiceUnitNetPrice", required = true)
	protected BigDecimal invoiceUnitNetPrice;
	@XmlElement(name = "TaxRate", required = true)
	protected BigDecimal taxRate;
//    @XmlElement(name = "UnitOfMeasure", required = true)
//    protected String unitOfMeasure;
	@XmlElement(name = "TaxAmount", required = true)
	protected BigDecimal taxAmount;
	@XmlElement(name = "NetAmount", required = true)
	protected BigDecimal netAmount;

	@XmlElement(name = "PreviousInvoiceQuantity", required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger previousQuantity;
	@XmlElement(name = "PreviousInvoiceUnitNetPrice", required = true) 
	protected BigDecimal previousInvoiceUnitNetPrice;
	@XmlElement(name = "PreviousTaxRate", required = true)
	protected BigDecimal previousTaxRate;
	@XmlElement(name = "PreviousTaxAmount", required = true)
	protected BigDecimal previousTaxAmount;
	@XmlElement(name = "PreviousNetAmount", required = true)
	protected BigDecimal previousNetAmount;
	
	
	
	

	@XmlElement(name = "CorrectionInvoiceQuantity", required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger correctionQuantity;
	@XmlElement(name = "CorrectionInvoiceUnitNetPrice", required = true)
	protected BigDecimal correctionInvoiceUnitNetPrice;
	@XmlElement(name = "CorrectionTaxAmount", required = true)
	protected BigDecimal correctionTaxAmount;
	@XmlElement(name = "CorrectionNetAmount", required = true)
	protected BigDecimal correctionNetAmount;
	
	
	

//	@XmlElement(name = "previousTaxRate", required = true)
//	protected BigDecimal previousTaxRate;

	public Integer getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Integer value) {
		this.lineNumber = value;
	}

	public String getEAN() {
		return ean;
	}

	public void setEAN(String value) {
		this.ean = value;
	}

//    public String getItemDescription() {
//        return itemDescription;
//    }
//
//    public void setItemDescription(String value) {
//        this.itemDescription = value;
//    }

	public BigDecimal getInvoiceUnitNetPrice() {
		return invoiceUnitNetPrice;
	}

	public void setInvoiceUnitNetPrice(BigDecimal value) {
		this.invoiceUnitNetPrice = value;
	}

	public BigDecimal getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(BigDecimal value) {
		this.taxRate = value;
	}

	public BigDecimal getPreviousTaxRate() {
		return previousTaxRate;
	}

	public void setPreviousTaxRate(BigDecimal value) {
		this.previousTaxRate = value;
	}

	public BigInteger getQuantity() {
		return quantity;
	}

	public void setQuantity(BigInteger value) {
		this.quantity = value;
	}

//    public String getUnitOfMeasure() {
//        return unitOfMeasure;
//    }
//
//    public void setUnitOfMeasure(String value) {
//        this.unitOfMeasure = value;
//    }

	public BigDecimal getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(BigDecimal value) {
		this.netAmount = value;
	}

	public BigInteger getPreviousQuantity() {
		return previousQuantity;
	}

	public void setPreviousQuantity(BigInteger value) {
		this.previousQuantity = value;
	}

	public BigInteger getCorrectionQuantity() {
		return correctionQuantity;
	}

	public void setCorrectionQuantity(BigInteger value) {
		this.correctionQuantity = value;
	}

	public BigDecimal getPreviousNetAmount() {
		return previousNetAmount;
	}

	public void setPreviousNetAmount(BigDecimal value) {
		this.previousNetAmount = value;

	}
	


	public BigDecimal getPreviousInvoiceUnitNetPrice() {
		return previousInvoiceUnitNetPrice;
	}

	public void setPreviousInvoiceUnitNetPrice(BigDecimal previousInvoiceUnitNetPrice) {
		this.previousInvoiceUnitNetPrice = previousInvoiceUnitNetPrice;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	public BigDecimal getTaxAmount() {
	return taxAmount;
}

	public BigDecimal getPreviousTaxAmount() {
		return previousTaxAmount;
	}

	public void setPreviousTaxAmount(BigDecimal previousTaxAmount) {
		this.previousTaxAmount = previousTaxAmount;
	}

	

	public BigDecimal getCorrectionInvoiceUnitNetPrice() {
		return correctionInvoiceUnitNetPrice;
	}

	public void setCorrectionInvoiceUnitNetPrice(BigDecimal correction) {
		this.correctionInvoiceUnitNetPrice = correction;
	}

	public BigDecimal getCorrectionTaxAmount() {
		return correctionTaxAmount;
	}

	public void setCorrectionTaxAmount(BigDecimal correction) {
		this.correctionTaxAmount = correction;
	}

	public BigDecimal getCorrectionNetAmount() {
		return correctionNetAmount;
	}

	public void setCorrectionNetAmount(BigDecimal correction) {
		this.correctionNetAmount = correction;
	}

}
