package com.ldb.testapi.Dao;

import com.ldb.testapi.Model.Card;
import com.ldb.testapi.Model.Test;
import com.ldb.testapi.Model.Customer;

import com.ldb.testapi.RowMapper.CardMapper;
import com.ldb.testapi.RowMapper.TestMapper;
import com.ldb.testapi.RowMapper.CustMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
@Component
public class ImpDao  implements Dao{

    @Autowired
    @Qualifier("WALLETJdbcTemplate")
     private JdbcTemplate WALLETJdbcTemplate;


    @Override
    public List<Test> getATM( String atmID) {

        List<Test> resutl = new ArrayList<>();
        try {

            String SQL = "SELECT  ATM_ID AS ATM ,ATM_LOCATION FROM CZ_ATM where ATM_ID = '"+atmID+"'  ";

            System.out.printf(SQL);
            resutl = WALLETJdbcTemplate.query(SQL , new TestMapper());

        }catch (Exception e){
            e.printStackTrace();
            return resutl;
        }
        return resutl;
    }

    @Override
    public List<Card> getCard(String cardNo) {

        List<Card> resultCard = new ArrayList<>();
        try {

            String SQL = "select CARD_NO , CARD_EMBOSSED_NAME , CARD_CUST_ID from onecard.cz_card where CARD_NO = '"+cardNo+"'  ";

            System.out.printf(SQL);
            resultCard = WALLETJdbcTemplate.query(SQL , new CardMapper());

        }catch (Exception e){
            e.printStackTrace();
            return resultCard;
        }
        return resultCard;
    }


    @Override
    public List<Customer> getCustDetail(String custID) {

        List<Customer> result = new ArrayList<>();
        try {

            String SQL = "SELECT CUSTOMER_ID, NAME, ADDRESS, WEBSITE, CREDIT_LIMIT  FROM CUSTOMERS_SAMPLEDATA WHERE CUSTOMER_ID = '"+custID+"'  ";

            System.out.printf(SQL);
            result = WALLETJdbcTemplate.query(SQL , new CustMapper());

        }catch (Exception e){
            e.printStackTrace();
            return result;
        }
        return result;
    }


}
