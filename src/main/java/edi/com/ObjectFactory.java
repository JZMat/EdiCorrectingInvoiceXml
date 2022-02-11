package edi.com;

public class ObjectFactory {
	
    public ObjectFactory() {
    }

    public Document createDocument() {
        return new Document();
    }

    public Header createHeader() {
        return new Header();
    }
    
    public LineItem createLineItem() {
        return new LineItem();
    }

    public Line createLine() {
        return new Line();
    }
    
    public Lines createLines() {
        return new Lines();
    }

	public Summary createSummary() {
		return new Summary();
	}
	
	public Order createOrder() {
		return new Order();
	}
	
	public Reference createReference() {
		return new Reference();
	}

	public TaxSummaryLine createTaxSummaryLine() {
		return new TaxSummaryLine();
	}

	public TaxSummary createTaxSummary() {
		return new TaxSummary();
	}

	public TaxSummaryLines createTaxSummaryLines() {
		return new TaxSummaryLines();
	}
	
	
}
