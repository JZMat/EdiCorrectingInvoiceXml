package edi.com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "", propOrder = {
        "buyerIln",
        "buyerName",

})

@XmlRootElement(name = "Buyer")
public class Buyer {

    private String buyerIln;
    private String buyerName;

    public String getBuyerIln() {
        return buyerIln;
    }

    @XmlElement(name = "ILN")
    public void setBuyerIln(String buyerIln) {
        this.buyerIln = buyerIln;
    }

    public String getBuyerName() {
        return buyerName;
    }

    @XmlElement(name = "Name")
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public Buyer(String buyerIln, String buyerName) {
        this.buyerIln = buyerIln;
        this.buyerName = buyerName;
    }

    public Buyer() {
    }

}
