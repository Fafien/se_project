package net.jeremykendall.refactoring.videostore;

public class TextStatement extends Statement {
    String headerString(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    String eachRentalString (Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
                aRental.getCharge() + "\n";
    }

    String footerString (Customer aCustomer) {
        return "Amount owed is " +
                aCustomer.getTotalCharge() + "\n" +
                "You earned " +
                aCustomer.getTotalFrequentRenterPoints() +
                " frequent renter points";
    }
}
