package com.sreenutech.tasks;

import com.sreenutech.model.OffersServiceResp;
import com.sreenutech.model.TaskResult;
import com.sreenutech.serviceclient.OffersServiceClient;

import java.util.concurrent.Callable;

public class OffersTask implements Callable<TaskResult> {
    private String customerId;
    public OffersTask(String customerId)
    {
        this.customerId=customerId;
    }

    @Override
    public TaskResult call() throws Exception {

        System.out.println("entered Offers service ");
        OffersServiceClient clientResponce = new OffersServiceClient();
        OffersServiceResp resp = clientResponce.getAllOffers(customerId);
        TaskResult tr1 = new TaskResult();
        tr1.setTaskName("offersTask");
        tr1.setResult(resp);

        System.out.println("executed Offers service ");


        return tr1;
    }
}
