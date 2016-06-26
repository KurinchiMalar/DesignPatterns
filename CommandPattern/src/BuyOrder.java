/**
 * Created by kurinchimalar on 26/6/16.
 */
public class BuyOrder implements Order {

    Stock stock;

    public BuyOrder(Stock stock){
        this.stock = stock;
    }

    public void execute(){

        stock.buy();
    }
}
