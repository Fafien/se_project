package net.jeremykendall.refactoring.videostore;

public class HtmlStatement extends Statement{
    String headerString(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    String eachRentalString(Rental aRental) {
        return aRental.getMovie().getTitle()+ ": " +
                aRental.getCharge() + "<BR>\n";
    }

    String footerString (Customer aCustomer) {
        return "<P>You owe <EM>" +
                aCustomer.getTotalCharge() +
                "</EM><P> " + "On this rental you earned <EM>" +
                aCustomer.getTotalFrequentRenterPoints() +
                "</EM> frequent renter points<P>";
    }
   }

