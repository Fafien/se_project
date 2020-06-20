package net.jeremykendall.refactoring.videostore;

public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
}