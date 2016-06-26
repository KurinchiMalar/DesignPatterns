/**
 * Created by kurinchimalar on 26/6/16.
 */
public class SellOrder implements Order {

    Stock stock;

    public SellOrder(Stock stock){
        this.stock = stock;
    }

    public void execute(){

        stock.sell();
    }
}
