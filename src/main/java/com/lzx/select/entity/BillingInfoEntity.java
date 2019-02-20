package com.lzx.select.entity;

public class BillingInfoEntity {
    int invoiceId;
    String billingAddress;
    String billingCity;
    String billingState;
    String billingCountry;
    String billingPostalCode;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    @Override
    public String toString() {
        return "BillingInfoEntity{" +
                "billingAddress='" + billingAddress + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingCountry='" + billingCountry + '\'' +
                ", billingPostalCode='" + billingPostalCode + '\'' +
                '}';
    }
}
