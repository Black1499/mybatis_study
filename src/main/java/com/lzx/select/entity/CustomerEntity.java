package com.lzx.select.entity;

import java.util.List;

public class CustomerEntity {
    int customerId;
    String firstName;
    String lastName;
    String company;
    String address;
    String city;
    String state;
    String country;
    String postalCode;
    String phone;
    String fax;
    String email;
    String supportRepld;
    List<InvoiceEntity> invoiceEntityList= null;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSupportRepld() {
        return supportRepld;
    }

    public void setSupportRepld(String supportRepld) {
        this.supportRepld = supportRepld;
    }

    public List<InvoiceEntity> getInvoiceEntityList() {
        return invoiceEntityList;
    }

    public void setInvoiceEntityList(List<InvoiceEntity> invoiceEntityList) {
        this.invoiceEntityList = invoiceEntityList;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", supportRepld='" + supportRepld + '\'' +
                ", invoiceEntityList=" + invoiceEntityList.size() +
                '}';
    }
}
