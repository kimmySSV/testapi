package com.ldb.testapi.Model;

import java.util.List;

public class Customer {
    private String custID;
    private String custName;
    private String custAddress;
    private String custWedsite;
    private int custCreditLimit;


    public Customer(){

    }

    public Customer(String custID){
        this.custID = custID;
    }

    public String getCustID() {
        return custID;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public String getCustWedsite() {
        return custWedsite;
    }

    public int getCustCreditLimit() {
        return custCreditLimit;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public void setCustWedsite(String custWedsite) {
        this.custWedsite = custWedsite;
    }

    public void setCustCreditLimit(int custCreditLimit) {
        this.custCreditLimit = custCreditLimit;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "custID='" + custID + '\'' +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custWedsite='" + custWedsite + '\'' +
                ", custCreditLimit=" + custCreditLimit +
                '}';
    }
}
