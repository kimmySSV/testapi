package com.ldb.testapi.Model;

import java.util.List;

public class CustomerRes {
    List<Customer>  data;

    public CustomerRes() {
    }

    public CustomerRes(List<Customer> data) {
        this.data = data;
    }

    public List<Customer> getData() {
        return data;
    }

    public void setData(List<Customer> data) {
        this.data = data;
    }
}
