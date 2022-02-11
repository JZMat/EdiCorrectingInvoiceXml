package edi.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "line", propOrder = {
    "lineItem"
})
public class Line {

    @XmlElement(name = "Line-Item", required = true)
    protected LineItem lineItem;

    public LineItem getLineItem() {
        return lineItem;
    }

    public void setLineItem(LineItem value) {
        this.lineItem = value;
    }

}
