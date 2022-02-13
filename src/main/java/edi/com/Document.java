package edi.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = { "header", "parties", "lines", "summary" })
@XmlRootElement(name = "Document-Invoice")
public class Document {

	@XmlElement(name = "Invoice-Header", required = true)
	protected Header header;
	@XmlElement(name = "Invoice-Parties", required = true)
	protected  Parties parties;
	@XmlElement(name = "Invoice-Lines", required = true)
	protected Lines lines;
	@XmlElement(name = "Invoice-Summary", required = true)
	protected Summary summary;

	public void setHeader(Header value) { this.header = value; }
	public void setParties(Parties value){ this.parties = value; }
	public void setLines(Lines value) {	this.lines = value;	}
    public void setSummary(Summary value) {
        this.summary = value;
    }
}
