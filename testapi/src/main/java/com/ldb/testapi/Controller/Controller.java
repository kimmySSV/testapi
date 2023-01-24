package com.ldb.testapi.Controller;

import com.ldb.testapi.Model.*;
import com.ldb.testapi.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    TestService testService;

    @GetMapping("/testAPI")
    public String testAPI(){
        return "hello";
    }

    @GetMapping("/getDataATM/{id}")
    public List<Test> getDataATM(@PathVariable(required = false,name = "id") String id){

        List<Test> restul = new ArrayList<>();

        try {
            restul = testService.testGetData( id);

        }catch (Exception e){
            e.printStackTrace();
            return  restul;
        }

        return restul;

    }


    @GetMapping("/getCustomer/{id}")
    public CustomerRes getCustDetail(@PathVariable(required = false,name = "id") String id){

        CustomerRes cust = new CustomerRes();

        try {
            cust = testService.getCustDetail( id);

        }catch (Exception e){
            e.printStackTrace();
            return cust;
        }

        return  cust;

    }


    @GetMapping("/getCard/{id}")
    public CardRes getCard(@PathVariable(required = false,name = "id") String id){

        Message message = new Message();
        CardRes result = new CardRes();

        try {
            result = testService.getCard( id);

        }catch (Exception e){
            e.printStackTrace();
            message.setDetail("fail");
            message.setCode("EE");
            result.setMessage(message);
            return  result;
        }

        return result;

    }


}
