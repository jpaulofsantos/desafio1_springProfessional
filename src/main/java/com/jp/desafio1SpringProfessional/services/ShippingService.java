package com.jp.desafio1SpringProfessional.services;

import com.jp.desafio1SpringProfessional.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public Double shipment(Order order){
        if (order.getBasic()<100.0){
            return 20.0;
        }

        if (order.getBasic()>=100 && order.getBasic()<200.00){
            return 12.00;
        }
        return 0.0;
    }
}
