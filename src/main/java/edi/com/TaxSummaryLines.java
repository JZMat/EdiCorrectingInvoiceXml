package edi.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxSummaryLines", propOrder = { "taxSummaryLine" })
public class TaxSummaryLines {

	@XmlElement(name = "Tax-Summary-Line", required = true)
	protected List<TaxSummaryLine> taxSummaryLine;

	public List<TaxSummaryLine> getLine() {
		if (taxSummaryLine == null) {
			taxSummaryLine = new ArrayList<>();
		}
		return this.taxSummaryLine;
	}

}
