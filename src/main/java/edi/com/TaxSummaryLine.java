package edi.com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"taxRate", "taxCategoryCode"})
@XmlRootElement(name = "TaxSummaryLine")
public class TaxSummaryLine {

    String taxRate;
    String taxCategoryCode;

    public String getTaxRate() {
        return taxRate;
    }

    @XmlElement(name = "TaxRate")
    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getTaxCategoryCode() {
        return taxCategoryCode;
    }

    @XmlElement(name = "TaxCategoryCode")
    public void setTaxCategoryCode(String taxCategoryCode) {
        this.taxCategoryCode = taxCategoryCode;
    }

}