/**
 * Created by kurinchimalar on 26/6/16.
 */
public class Demo {

    public static void main(String[] args){

        Stock cisco = new Stock("CSCO",10);
        Stock amazon = new Stock("AMZ",100);
        Stock pypl = new Stock("PYPL",3);

        Order buyorder1 = new BuyOrder(cisco);
        Order sellorder1 = new SellOrder(pypl);
        Order buyorder2 = new BuyOrder(amazon);
        Order sellorder2 = new SellOrder(cisco);

        Broker broker = new Broker();
        broker.takeOrder(buyorder1);
        broker.takeOrder(sellorder1);
        broker.takeOrder(buyorder2);
        broker.takeOrder(sellorder2);
        broker.placeOrders();
    }
}
