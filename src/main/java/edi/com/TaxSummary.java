package edi.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxSummary", propOrder = {
    "taxSummaryLine"
})
public class TaxSummary {

  

	@XmlElement(name = "Tax-Summary-Line", required = true)
    protected TaxSummaryLine taxSummaryLine;

    public TaxSummaryLine getTaxSummaryLine() {
        return taxSummaryLine;
    }

    public void setTaxSummaryLine(TaxSummaryLine taxSummaryLine) {
  		this.taxSummaryLine = taxSummaryLine;
  	}

}
