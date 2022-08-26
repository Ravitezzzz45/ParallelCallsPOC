package com.sreenutech.dao;

import com.sreenutech.model.CustomerDaoResp;

public class CustomerDao {

    public CustomerDaoResp getCustomer(String customerId)
    {
        //prepare the request for database
        //call database and get the responce
        CustomerDaoResp daoResp = new CustomerDaoResp();

        daoResp.setName("Ravi");
        daoResp.setMobNo("8884224657");
        daoResp.setEmail("ravitejapolepalli.1996@gmail.com");
        daoResp.setAddress("Ho no14 jnfken");
        daoResp.setDob("23/03/1997");
        return daoResp;
    }
}
