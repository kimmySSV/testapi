package com.ldb.testapi.Dao;

import com.ldb.testapi.Model.Card;
import com.ldb.testapi.Model.Test;
import com.ldb.testapi.Model.Customer;


import java.util.List;

public interface Dao {
    List<Test> getATM ( String atmId);
    List<Card> getCard (String cardNo);

    List<Customer> getCustDetail (String custID);
}
