package edi.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "taxSummary"
})
public class TaxSummary {

    @XmlElement(name = "Tax-Summary", required = true)
    protected TaxSummary taxSummary;

    public TaxSummary getTaxSummary() {
        return taxSummary;
    }

    public void setTaxSummary(TaxSummary value) {
        this.taxSummary = value;
    }

}
