package com.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author threecat
* @date 2023/4/21
*/
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
