package hellicott.tvprices;

import org.junit.Assert;
import org.junit.Test;

public class TestCheapestPrice{
    @Test
    public void testCanFindCheapestPriceWhenAllUnique(){
        // arrange
        Retailer t = new RetailerStub(2.99);
        Retailer sb = new RetailerStub(350.39);
        Retailer atv = new RetailerStub(25.55);
        TvPrices tvPrices = new TvPrices(new Retailer[]{t, sb, atv});
        // assert
        Assert.assertEquals("Televizion", TvPrices.findCheapest("make", "model"));
    }
    
    static class RetailerStub implements Retailer{
        private double price;
        RetailerStub(double price){
            this.price = price;
        }
        public double getPrice(String make, String model){
            return price;
        }
    }
    
    
    
    
}
