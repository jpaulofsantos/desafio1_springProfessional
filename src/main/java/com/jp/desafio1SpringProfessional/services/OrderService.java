package com.jp.desafio1SpringProfessional.services;

import com.jp.desafio1SpringProfessional.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService){
        this.shippingService = shippingService;
    }

    public Double total(Order order){

        return (order.getBasic()-(order.getBasic() * (order.getDiscount()/100))) + shippingService.shipment(order);

    }


}
