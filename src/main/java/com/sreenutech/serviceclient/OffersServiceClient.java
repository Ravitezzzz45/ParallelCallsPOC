package com.sreenutech.serviceclient;

import com.sreenutech.model.OffersServiceResp;

public class OffersServiceClient {
    public OffersServiceResp getAllOffers(String customerId)
    {
        OffersServiceResp responce = new OffersServiceResp();
        responce.setId("12");
        responce.setDiscount("50%");
        responce.setExpdate("34.98/1990");
        responce.setName("mobile");
        responce.setDesc("good");
        return responce;
    }
}
