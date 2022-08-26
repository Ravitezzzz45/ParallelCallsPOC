package com.sreenutech.tasks;

import com.sreenutech.dao.CustomerDao;
import com.sreenutech.model.CustomerDaoResp;
import com.sreenutech.model.TaskResult;

import java.util.concurrent.Callable;

public class CustomerTask implements Callable<TaskResult> {

    private String customerId;

    public CustomerTask(String customerId)
    {
        this.customerId=customerId;
    }

    @Override
    public TaskResult call() throws Exception {
        System.out.println("Entered into customer dao");
        CustomerDao dao= new CustomerDao();
        CustomerDaoResp daoResp =dao.getCustomer(customerId);
        TaskResult tr= new TaskResult();
        tr.setTaskName("customerTask");
        tr.setResult(daoResp);
        System.out.println("executed Offers service ");

        return tr;

    }
}
