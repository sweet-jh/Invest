/**
 * Created by hjing on 1/26/17.
 */
public class Fund {
    Stock1 stock1 = new Stock1();
    Stock2 stock2 = new Stock2();
    Stock3 stock3 = new Stock3();
    public void sell()
    {
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }
}
