package edi.com;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "summary", propOrder = { "totalLines", "totalNetAmount", "totalTaxAmount", "previousTotalNetAmount"
		, "previousTotalTaxAmount", "correctionTotalNetAmount", "correctionTotalTaxAmount", "taxSummary" })

public class Summary {

	@XmlElement(name = "TotalLines", required = true)
	protected BigInteger totalLines;
	@XmlElement(name = "TotalNetAmount", required = true)
	protected BigDecimal totalNetAmount;	
	@XmlElement(name = "TotalTaxAmount", required = true)
	protected BigDecimal totalTaxAmount;
	@XmlElement(name = "PreviousTotalNetAmount", required = true)
	protected BigDecimal previousTotalNetAmount;
	@XmlElement(name = "PreviousTotalTaxAmount", required = true)
	protected BigDecimal previousTotalTaxAmount;
	@XmlElement(name = "CorrectionTotalNetAmount", required = true)
	protected BigDecimal correctionTotalNetAmount;
	@XmlElement(name = "CorrectionTotalTaxAmount", required = true)
	protected BigDecimal correctionTotalTaxAmount;
	@XmlElement(name = "Tax-Summary", required = true)
	protected TaxSummary taxSummary;

	public void setTotalLines(BigInteger value) {	this.totalLines = value;	}
	public void setTotalNetAmount(BigDecimal value) {
		this.totalNetAmount = value;
	}
	public BigDecimal getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(BigDecimal value) {
		this.totalTaxAmount = value;
	}
	public BigDecimal getPreviousTotalTaxAmount() {
		return previousTotalTaxAmount;
	}
	public void setPreviousTotalTaxAmount(BigDecimal value) {
		this.previousTotalTaxAmount = value;
	}
	public BigDecimal getCorrectionTotalTaxAmount() {
		return correctionTotalTaxAmount;
	}
	public void setCorrectionTotalTaxAmount(BigDecimal value) {
		this.correctionTotalTaxAmount = value;
	}
	public BigInteger getTotalLines() {
		return totalLines;
	}
	public BigDecimal getCorrectionTotalNetAmount() {
		return correctionTotalNetAmount;
	}
	public void setPreviousTotalNetAmount(BigDecimal value) {
		this.previousTotalNetAmount = value;
	}
	public void setCorrectionTotalNetAmount(BigDecimal value) {
		this.correctionTotalNetAmount = value;
	}
	public BigDecimal getTotalNetAmount() {
		return totalNetAmount;
	}
	public BigDecimal getPreviousTotalNetAmount() {
		return previousTotalNetAmount;
	}
	public TaxSummary getTaxSummary() {
		return taxSummary;
	}
	public void setTaxSummary(TaxSummary value) {
		this.taxSummary = value;
	}

}
