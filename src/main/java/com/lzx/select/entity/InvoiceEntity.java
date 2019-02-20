package com.lzx.select.entity;

import java.util.Date;

public class InvoiceEntity {
    int invoiceId;
    Date invoiceDate;
    float total;

    BillingInfoEntity billingInfoEntity;
    CustomerEntity customerEntity;


    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public BillingInfoEntity getBillingInfoEntity() {
        return billingInfoEntity;
    }

    public void setBillingInfoEntity(BillingInfoEntity billingInfoEntity) {
        this.billingInfoEntity = billingInfoEntity;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    @Override
    public String toString() {
        return "InvoiceEntity{" +
                "invoiceId=" + invoiceId +
                ", invoiceDate=" + invoiceDate +
                ", total=" + total +
                ", billingInfoEntity=" + billingInfoEntity +
                ", customerEntity=" + customerEntity +
                '}';
    }
}
