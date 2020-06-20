package net.jeremykendall.refactoring.videostore;

public class HtmlStatement extends Statement{
    String headerString(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    String eachRentalString(Rental aRental) {
        return aRental.getMovie().getTitle()+ ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    String footerString (Customer aCustomer) {
        return "<P>You owe <EM>" +
                String.valueOf(aCustomer.getTotalCharge()) +
                "</EM><P> " + "On this rental you earned <EM>" +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }
   }

