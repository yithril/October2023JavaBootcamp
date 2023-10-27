package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class LedgerItem {
    private String description;
    private String vendor;
    private double amount;
    private LocalDate localDate;
    private LocalTime localTime;

    public LedgerItem(String description, String vendor, double amount, LocalDate localDate, LocalTime localTime) {
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
        this.localDate = localDate;
        this.localTime = localTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    @Override
    public String toString(){
        return String.format("%s|%s|%s|%s|%f %n", this.getLocalDate(), this.getLocalTime(), this.getDescription(), this.getVendor(), this.getAmount());
    }
}
