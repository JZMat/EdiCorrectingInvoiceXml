package edi.com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "", propOrder = {
        "sellerIln",
        "sellerName"

})

@XmlRootElement(name = "Seller")
public class Seller {


    private String sellerIln;
    private String sellerName;

    public String getSellerIln() {
        return sellerIln;
    }

    @XmlElement(name = "ILN")
    public void setSellerIln(String sellerIln) {
        this.sellerIln = sellerIln;
    }

    public String getSellerName() {
        return sellerName;
    }

    @XmlElement(name = "Name")
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Seller(String sellerIln, String sellerName) {
        super();
        this.sellerIln = sellerIln;
        this.sellerName = sellerName;
    }

    public Seller() {
        super();
    }

}

