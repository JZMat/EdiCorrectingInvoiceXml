package edi.com;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class XmlApp {

    public static void main(String[] args) {

        XmlApp app = new XmlApp();
        try {
            app.start();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    private void start() throws JAXBException {
        ObjectFactory factory = new ObjectFactory();
        Document message = factory.createDocument();

        Header header = factory.createHeader();
        header.setInvoiceNumber("1234");
        header.setInvoiceDate("2021-07-30");
        header.setSalesDate("2021-07-30");
        header.setInvoiceDuplicateDate("2021-07-30");
        header.setInvoiceCurrency("PLN");
        header.setDocumentFunctionCode("C");
        header.setCorrectionReason("Różnica");

        Order order = factory.createOrder();
        order.setBuyerOrderNumber("1500");
        order.setBuyerOrderDate("2021-07-30");
        header.setOrder(order);

        Reference reference = factory.createReference();
        reference.setInvoiceReferenceNumber("0051");
        reference.setInvoiceReferenceDate("2021-07-30");
        header.setReference(reference);

        message.setHeader(header);

        // ------------------------------------------------------
        Parties parties = factory.createParties();
        Buyer buyer = factory.createBuyer();
        buyer.setBuyerIln("1234567890123");
        buyer.setBuyerName("Buyer name");
        parties.setBuyer(buyer);
        message.setParties(parties);
        // ------------------------------------------------------

        Lines lines = factory.createLines();
        LineItem lineItem1 = factory.createLineItem();
        lineItem1.setLineNumber(1);
        lineItem1.setEAN("5902143712237");
        lineItem1.setInvoiceUnitNetPrice(new BigDecimal("12.99").setScale(2, RoundingMode.HALF_UP));
        lineItem1.setQuantity(new BigInteger("1"));
        lineItem1.setTaxRate(new BigDecimal("7.0").setScale(2, RoundingMode.HALF_UP));
        lineItem1.setTaxAmount(lineItem1.getInvoiceUnitNetPrice()
                .multiply(new BigDecimal(lineItem1.getQuantity()))
                .multiply(lineItem1.getTaxRate().divide(new BigDecimal(100), RoundingMode.HALF_UP))
                .setScale(2, RoundingMode.HALF_UP));
        lineItem1.setNetAmount(lineItem1.getInvoiceUnitNetPrice().multiply(new BigDecimal(lineItem1.getQuantity())).setScale(2,
                RoundingMode.HALF_UP));
        lineItem1.setPreviousQuantity(new BigInteger("2"));
        lineItem1.setPreviousTaxRate(new BigDecimal(7).setScale(2, RoundingMode.HALF_UP));
        lineItem1.setPreviousInvoiceUnitNetPrice(new BigDecimal("12.99").setScale(2, RoundingMode.HALF_UP));
        lineItem1.setPreviousTaxAmount(lineItem1.getPreviousInvoiceUnitNetPrice()
                .multiply(new BigDecimal(lineItem1.getPreviousQuantity()))
                .multiply(lineItem1.getPreviousTaxRate().divide(new BigDecimal(100), RoundingMode.HALF_UP))
                .setScale(2, RoundingMode.HALF_UP));
        lineItem1.setPreviousNetAmount(lineItem1.getInvoiceUnitNetPrice()
                .multiply(new BigDecimal(lineItem1.getPreviousQuantity())).setScale(2, RoundingMode.HALF_UP));
        lineItem1.setCorrectionQuantity(lineItem1.getQuantity().subtract(lineItem1.getPreviousQuantity()));
        lineItem1.setCorrectionTaxAmount(lineItem1.getTaxAmount().subtract(lineItem1.getPreviousTaxAmount()));
        lineItem1.setCorrectionInvoiceUnitNetPrice(lineItem1.getInvoiceUnitNetPrice().subtract(lineItem1.getPreviousInvoiceUnitNetPrice()));
        lineItem1.setCorrectionNetAmount(lineItem1.getNetAmount().subtract(lineItem1.getPreviousNetAmount()));
        Line line1 = factory.createLine();
        line1.setLineItem(lineItem1);
        lines.getLine().add(line1);


        LineItem lineItem2 = factory.createLineItem();
        lineItem2.setLineNumber(2);
        lineItem2.setEAN("5902143712220");
        lineItem2.setInvoiceUnitNetPrice(new BigDecimal("12.99").setScale(2, RoundingMode.HALF_UP));
        lineItem2.setQuantity(new BigInteger("1"));
        lineItem2.setTaxRate(new BigDecimal("5.0").setScale(2, RoundingMode.HALF_UP));
        lineItem2.setTaxAmount(lineItem2.getInvoiceUnitNetPrice()
                .multiply(new BigDecimal(lineItem2.getQuantity()))
                .multiply(lineItem2.getTaxRate().divide(new BigDecimal(100), RoundingMode.HALF_UP))
                .setScale(2, RoundingMode.HALF_UP));
        lineItem2.setNetAmount(lineItem2.getInvoiceUnitNetPrice().multiply(new BigDecimal(lineItem2.getQuantity())).setScale(2,
                RoundingMode.HALF_UP));
        lineItem2.setPreviousQuantity(new BigInteger("2"));
        lineItem2.setPreviousTaxRate(new BigDecimal(5).setScale(2, RoundingMode.HALF_UP));
        lineItem2.setPreviousInvoiceUnitNetPrice(new BigDecimal("12.99").setScale(2, RoundingMode.HALF_UP));
        lineItem2.setPreviousTaxAmount(lineItem2.getPreviousInvoiceUnitNetPrice()
                .multiply(new BigDecimal(lineItem2.getPreviousQuantity()))
                .multiply(lineItem2.getPreviousTaxRate().divide(new BigDecimal(100), RoundingMode.HALF_UP))
                .setScale(2, RoundingMode.HALF_UP));
        lineItem2.setPreviousNetAmount(lineItem2.getInvoiceUnitNetPrice()
                .multiply(new BigDecimal(lineItem2.getPreviousQuantity())).setScale(2, RoundingMode.HALF_UP));
        lineItem2.setCorrectionQuantity(lineItem2.getQuantity().subtract(lineItem2.getPreviousQuantity()));
        lineItem2.setCorrectionTaxAmount(lineItem2.getTaxAmount().subtract(lineItem2.getPreviousTaxAmount()));
        lineItem2.setCorrectionInvoiceUnitNetPrice(lineItem2.getInvoiceUnitNetPrice().subtract(lineItem2.getPreviousInvoiceUnitNetPrice()));
        lineItem2.setCorrectionNetAmount(lineItem2.getNetAmount().subtract(lineItem2.getPreviousNetAmount()));
        Line line2 = factory.createLine();
        line2.setLineItem(lineItem2);
        lines.getLine().add(line2);
		  
	/*	  LineItem lineItem3 = factory.createLineItem(); lineItem3.setLineNumber(3);
		  lineItem3.setEAN("5902143712220"); //
		  lineItem3.setItemDescription("Kolczyki 9,99 1 szt");
		  lineItem3.setUnitNetPrice(new BigDecimal("9.99").setScale(2,
		  RoundingMode.HALF_UP)); lineItem3.setQuantity(new BigInteger("100")); //
		  lineItem3.setUnitOfMeasure(UoM); // lineItem3.setNetAmount(new
		  BigDecimal(9.99).setScale(2, // RoundingMode.HALF_UP));
		  
		  lineItem3.setNetAmount(lineItem3.getUnitNetPrice().multiply(new
		  BigDecimal(lineItem3.getQuantity())).setScale(2, RoundingMode.HALF_UP)); Line
		  line3 = factory.createLine(); line3.setLineItem(lineItem3);
		  lines.getLine().add(line3);*/


        message.setLines(lines);

        /*
         **** S U M M A R Y ***
         */
        Summary summary = factory.createSummary();
        summary.setTotalLines(BigInteger.valueOf(lines.getLine().size()));
//		List<BigInteger> bdList = new ArrayList<>();
//		lines.getLine().forEach(line -> bdList.add(line.getLineItem().getQuantity()));
//		BigInteger result = bdList.parallelStream().reduce(BigInteger.ZERO, BigInteger::add);
//		summary.setTotalGoodsAmount(result);


        List<BigDecimal> netAmountList = new ArrayList<>();
        lines.getLine().forEach(line -> netAmountList.add(line.getLineItem().getNetAmount()));
        BigDecimal netAmount = netAmountList.parallelStream().reduce(BigDecimal.ZERO, BigDecimal::add);
        summary.setTotalNetAmount(netAmount.setScale(2, RoundingMode.HALF_UP));


        List<BigDecimal> taxAmountList = new ArrayList<>();
        lines.getLine().forEach(line -> taxAmountList.add(line.getLineItem().getTaxAmount()));
        BigDecimal taxAmount = taxAmountList.parallelStream().reduce(BigDecimal.ZERO, BigDecimal::add);
        summary.setTotalTaxAmount(taxAmount.setScale(2, RoundingMode.HALF_UP));


        List<BigDecimal> previousNetAmountList = new ArrayList<>();
        lines.getLine().forEach(line -> previousNetAmountList.add(line.getLineItem().getPreviousNetAmount()));
        BigDecimal previousNetAmount = previousNetAmountList.parallelStream().reduce(BigDecimal.ZERO, BigDecimal::add);
        summary.setPreviousTotalNetAmount(previousNetAmount.setScale(2, RoundingMode.HALF_UP));


        List<BigDecimal> previousTaxAmountList = new ArrayList<>();
        lines.getLine().forEach(line -> previousTaxAmountList.add(line.getLineItem().getPreviousTaxAmount()));
        BigDecimal previousTaxAmount = previousTaxAmountList.parallelStream().reduce(BigDecimal.ZERO, BigDecimal::add);
        summary.setPreviousTotalTaxAmount(previousTaxAmount.setScale(2, RoundingMode.HALF_UP));


        summary.setCorrectionTotalNetAmount((summary.getTotalNetAmount()).subtract(summary.getPreviousTotalNetAmount()));

        summary.setCorrectionTotalTaxAmount((summary.getTotalTaxAmount()).subtract(summary.getPreviousTotalTaxAmount()));

        TaxSummary taxSummary = factory.createTaxSummary();
        TaxSummaryLine taxSummaryLine1 = factory.createTaxSummaryLine();
        taxSummary.setTaxSummaryLine(taxSummaryLine1);

        TaxSummaryLine taxSummaryLine2 = factory.createTaxSummaryLine();
        taxSummary.setTaxSummaryLine(taxSummaryLine2);
        summary.setTaxSummary(taxSummary);

        message.setSummary(summary);
        // ------------------------------------------------------

        JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "Windows-1250");
        jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.FALSE);
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(message, new File("test.xml"));

    }

}
