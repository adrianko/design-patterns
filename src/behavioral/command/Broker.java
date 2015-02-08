package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    
    private List<Order> orderList = new ArrayList<>();
    
    public void takeOrder(Order o) {
        orderList.add(o);
    }

    public void placeOrders() {
        orderList.forEach(behavioral.command.Order::execute);
        orderList.clear();
    }
    
}