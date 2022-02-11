package edi.com;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parties", propOrder = {"buyer", "seller"

})

@XmlRootElement(name = "Invoice-Parties")
public class Parties {
    @XmlElement(name = "Seller")
    private Seller seller;
    @XmlElement(name = "Buyer")
    private Buyer buyer;

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

}
