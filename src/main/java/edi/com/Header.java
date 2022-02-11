package edi.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "header", propOrder = {"invoiceNumber", "invoiceDate", "salesDate", "invoiceDuplicateDate", "invoiceCurrency", "documentFunctionCode", "correctionReason", "order", "reference"})
public class Header {

    @XmlElement(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;

    void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    @XmlElement(name = "InvoiceDate", required = true)
    protected String invoiceDate;

    void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    @XmlElement(name = "SalesDate", required = true)
    protected String salesDate;

    void setSalesDate(String value) {
        this.salesDate = value;
    }

    @XmlElement(name = "InvoiceDuplicateDate", required = true)
    protected String invoiceDuplicateDate;

    void setInvoiceDuplicateDate(String value) {
        this.invoiceDuplicateDate = value;
    }

    @XmlElement(name = "DocumentFunctionCode", required = true)
    protected String documentFunctionCode;

    void setDocumentFunctionCode(String value) {
        this.documentFunctionCode = value;
    }

    @XmlElement(name = "CorrectionReason", required = true)
    protected String correctionReason;

    void setCorrectionReason(String value) {
        this.correctionReason = value;
    }

    @XmlElement(name = "InvoiceCurrency", required = true)
    protected String invoiceCurrency;

    void setInvoiceCurrency(String string) {
        this.invoiceCurrency = string;

    }

    @XmlElement(name = "Order", required = true)
    protected Order order;

    void setOrder(Order value) {
        this.order = value;
    }

    @XmlElement(name = "Reference", required = true)
    protected Reference reference;

    void setReference(Reference string) {
        this.reference = string;

    }

}
