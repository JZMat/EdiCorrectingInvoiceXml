package edi.com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Tax-Summary")
public class TaxSummary {

    List<TaxSummaryLine> taxSummaryLines;

    public List<TaxSummaryLine> getTaxSummaryLines() {
        return taxSummaryLines;
    }

    /**
     * element that is going to be marshaled in the xml
     */
    @XmlElement(name = "Tax-Summary-Line")
    public void setTaxSummaryLines(List<TaxSummaryLine> taxSummaryLines) {
        this.taxSummaryLines = taxSummaryLines;
    }

    /**
     * This method is not used by jaxb, just used for business reasons. In the case that this class
     * would be generated using xml schemas definitions, this method has to be added to the
     * generated class or to some helper or util one
     */
    public void add(TaxSummaryLine taxSummaryLine) {
        if (this.taxSummaryLines == null) {
            this.taxSummaryLines = new ArrayList<>();
        }
        this.taxSummaryLines.add(taxSummaryLine);

    }

}
