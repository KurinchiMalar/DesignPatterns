import java.util.List;
import java.util.ArrayList;

/**
 * Created by kurinchimalar on 26/6/16.
 */
public class Broker {

    private List<Order> orderlist = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderlist.add(order);
    }

    public void placeOrders(){

        for(Order order:orderlist){
            order.execute();
        }
    }
}
