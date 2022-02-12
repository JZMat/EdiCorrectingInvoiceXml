package edi.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tax-summary-line", propOrder = { "taxRate" })
public class TaxSummaryLine {

	@XmlElement(name = "TaxRate", required = true)
	protected Integer taxRate;

	public Integer getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Integer taxRate) {
		this.taxRate = taxRate;
	}

}

///////////////////

/*
 * public static class TaxSummaryLine {
 * 
 * @XmlElement(name = "TaxRate", required = true) protected String taxRate;
 * 
 * @XmlElement(name = "TaxCategoryCode", required = true) protected String
 * taxCategoryCode;
 * 
 * @XmlElement(name = "TaxAmount", required = true) protected String taxAmount;
 * 
 * @XmlElement(name = "TaxableAmount", required = true) protected String
 * taxableAmount;
 * 
 * @XmlElement(name = "PreviousTaxRate", required = true) protected String
 * previousTaxRate;
 * 
 * @XmlElement(name = "PreviousTaxCategoryCode", required = true) protected
 * String previousTaxCategoryCode;
 * 
 * @XmlElement(name = "PreviousTaxAmount", required = true) protected String
 * previousTaxAmount;
 * 
 * @XmlElement(name = "PreviousTaxableAmount", required = true) protected String
 * previousTaxableAmount;
 * 
 * @XmlElement(name = "CorrectionTaxAmount", required = true) protected String
 * correctionTaxAmount;
 * 
 * @XmlElement(name = "CorrectionTaxableAmount", required = true) protected
 * String correctionTaxableAmount;
 * 
 *//**
	 * Gets the value of the taxRate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getTaxRate() { return taxRate; }
 * 
 *//**
	 * Sets the value of the taxRate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
/*
 * public void setTaxRate(String value) { this.taxRate = value; }
 * 
 *//**
	 * Gets the value of the taxCategoryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getTaxCategoryCode() { return taxCategoryCode; }
 * 
 *//**
	 * Sets the value of the taxCategoryCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
/*
 * public void setTaxCategoryCode(String value) { this.taxCategoryCode = value;
 * }
 * 
 *//**
	 * Gets the value of the taxAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getTaxAmount() { return taxAmount; }
 * 
 *//**
	 * Sets the value of the taxAmount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
/*
 * public void setTaxAmount(String value) { this.taxAmount = value; }
 * 
 *//**
	 * Gets the value of the taxableAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getTaxableAmount() { return taxableAmount; }
 * 
 *//**
	 * Sets the value of the taxableAmount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
/*
 * public void setTaxableAmount(String value) { this.taxableAmount = value; }
 * 
 *//**
	 * Gets the value of the previousTaxRate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getPreviousTaxRate() { return previousTaxRate; }
 * 
 *//**
	 * Sets the value of the previousTaxRate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
/*
 * public void setPreviousTaxRate(String value) { this.previousTaxRate = value;
 * }
 * 
 *//**
	 * Gets the value of the previousTaxCategoryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getPreviousTaxCategoryCode() { return previousTaxCategoryCode;
 * }
 * 
 *//**
	 * Sets the value of the previousTaxCategoryCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
/*
 * public void setPreviousTaxCategoryCode(String value) {
 * this.previousTaxCategoryCode = value; }
 * 
 *//**
	 * Gets the value of the previousTaxAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getPreviousTaxAmount() { return previousTaxAmount; }
 * 
 *//**
	 * Sets the value of the previousTaxAmount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
/*
 * public void setPreviousTaxAmount(String value) { this.previousTaxAmount =
 * value; }
 * 
 *//**
	 * Gets the value of the previousTaxableAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getPreviousTaxableAmount() { return previousTaxableAmount; }
 * 
 *//**
	 * Sets the value of the previousTaxableAmount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
/*
 * public void setPreviousTaxableAmount(String value) {
 * this.previousTaxableAmount = value; }
 * 
 *//**
	 * Gets the value of the correctionTaxAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getCorrectionTaxAmount() { return correctionTaxAmount; }
 * 
 *//**
	 * Sets the value of the correctionTaxAmount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
/*
 * public void setCorrectionTaxAmount(String value) { this.correctionTaxAmount =
 * value; }
 * 
 *//**
	 * Gets the value of the correctionTaxableAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
/*
 * public String getCorrectionTaxableAmount() { return correctionTaxableAmount;
 * }
 * 
 *//**
	 * Sets the value of the correctionTaxableAmount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 *//*
		 * public void setCorrectionTaxableAmount(String value) {
		 * this.correctionTaxableAmount = value; }
		 * 
		 * }
		 */