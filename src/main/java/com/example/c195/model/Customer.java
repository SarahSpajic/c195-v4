package com.example.c195.model;

import javafx.collections.FXCollections;

import java.util.List;

public class Customer {
    private int divisionID;
    private int countryID;
    private String divisionName;
    private List<Appointment> associatedAppointments = FXCollections.observableArrayList();
    private int customerID;
    private String name;
    private String address;
    private String postalCode;
    private String phoneNumber;
    private String countryName;



    public Customer(int customerID, String name, String address, String postalCode, String phoneNumber, int divisionID, int countryID) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.divisionID = divisionID;
        this.countryID = countryID;
    }
    public Customer(int customerID, String name, String address, String postalCode, String phoneNumber, String divisionName, int countryID, String country) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.divisionName = divisionName;
        this.countryID = countryID;
        this.countryName = countryName;
    }

    public Customer(int customerID, String name, String address, String postalCode, String phone, int divisionID) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phone;
        this.divisionID = divisionID;

    }

    public Customer(int customerID, String name, String address, String postalCode, String phoneNumber, int divisionID, int countryID, String country) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.divisionID = divisionID;
        this.countryID = countryID;
        this.countryName = country;
    }


    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }
    public Customer(String name) {
    }

    public Customer(int customerID, String customerName, String phone) {
    }

    public Customer(int customerID, String name, String address, String postalCode, String phoneNumber) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }



    public List<Appointment> getAssociatedAppointments() {
        return associatedAppointments;
    }

    public void setAssociatedAppointments(Appointment appointment) {
        associatedAppointments.add(appointment);
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }

    public Customer addCustomer(Customer newCustomer) {
        return newCustomer;
    }

    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }
}
