package edi.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lines", propOrder = { "line" })
public class Lines {

	@XmlElement(name = "Line", required = true)
	protected List<Line> line;

	public List<Line> getLine() {
		if (line == null) {
			line = new ArrayList<>();
		}
		return this.line;
	}

}
