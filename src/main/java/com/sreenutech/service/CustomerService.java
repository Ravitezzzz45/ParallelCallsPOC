package com.sreenutech.service;

import com.sreenutech.dao.CustomerDao;
import com.sreenutech.model.CustomerDaoResp;
import com.sreenutech.model.CustomerDetails;
import com.sreenutech.model.OffersServiceResp;
import com.sreenutech.model.TaskResult;
import com.sreenutech.tasks.CustomerTask;
import com.sreenutech.tasks.OffersTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CustomerService {

    public CustomerDetails getCustomerDetails(String customerId) throws InterruptedException, ExecutionException {
     CustomerDetails customerDetails = new CustomerDetails();
        ExecutorService service = Executors.newFixedThreadPool(2);
        List taskList = new ArrayList();
        taskList.add(new CustomerTask(customerId));
        taskList.add(new OffersTask(customerId));

        List<Future<TaskResult>> futureList = service.invokeAll(taskList);

        for (Future fe :futureList)
        {
            TaskResult tr = (TaskResult) fe.get();
            if("customerTask".equals(tr.getTaskName()))
            {
              CustomerDaoResp resp = (CustomerDaoResp) tr.getResult();
              customerDetails.setName(resp.getName());
              customerDetails.setMobNo(resp.getMobNo());
              customerDetails.setDob(resp.getDob());
              customerDetails.setAddress(resp.getAddress());
              customerDetails.setEmail(resp.getEmail());
            }
            if("offersTask".equals(tr.getTaskName()))
            {
                OffersServiceResp resp = (OffersServiceResp)tr.getResult();
               // customerDetails.setName(resp.getName());
                customerDetails.setDesc(resp.getDesc());
                customerDetails.setDiscount(resp.getDiscount());
                customerDetails.setId(resp.getId());
                customerDetails.setOfferName(resp.getName());
                customerDetails.setExpdate(resp.getExpdate());
            }
        }
        //service.invokeAll()

     return customerDetails;
    }
}
