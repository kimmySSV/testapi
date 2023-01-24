package com.ldb.testapi.Service;

import com.ldb.testapi.Dao.ImpDao;
import com.ldb.testapi.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class TestService {

    @Autowired
    ImpDao impDao;

    public List<Test> testGetData ( String atmId){
        List<Test> result = new ArrayList<>();

        try {
            result = impDao.getATM(atmId);

        }catch (Exception e){
            e.printStackTrace();
            return  result;
        }
        return  result;
    }

    public CardRes getCard (String cardNo){
        CardRes result = new CardRes();
        List<Card> listdata = new ArrayList<>();
        Message message = new Message();

        Card data = new Card();
        listdata = impDao.getCard(cardNo);

        if(listdata.isEmpty() || listdata.size() < 1){
            message.setCode("01");
            message.setDetail("nodata");
            result.setMessage(message);
            result.setCard(listdata);
            return result;
        }

        message.setCode("00");
        message.setDetail("success");
        result.setMessage(message);
        result.setCard(listdata);
        return result;
    }

    public CustomerRes getCustDetail (String custID){
        CustomerRes result = new CustomerRes();
        List<Customer> listdata = new ArrayList<>();

        listdata = impDao.getCustDetail(custID);
        result.setData(listdata);
        return  result;

    }

}


