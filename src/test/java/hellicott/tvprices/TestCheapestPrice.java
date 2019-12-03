package hellicott.tvprices;

import org.junit.Assert;
import org.junit.Test;

public class TestCheapestPrice{
    @Test
    public void testCanFindCheapestPriceWhenAllUnique(){
        // arrange
        Retailer t = new RetailerStub(2.99, "Televizion");
        Retailer sb = new RetailerStub(350.39, "Screen Bargains");
        Retailer atv = new RetailerStub(25.55, "Acme TV");
        TvPrices tvPrices = new TvPrices(new Retailer[]{t, sb, atv});
        // assert
        Assert.assertEquals("Televizion", TvPrices.findCheapest("make", "model"));
    }
    
    static class RetailerStub implements Retailer{
        private double price;
        private String name;
        RetailerStub(double price, String name){
            this.price = price;
            this.name = name;
        }
        
        public double getPrice(String make, String model){
            return price;
        }
    
        public String getName(){
            return this.name;
        }
    }
    
    
    
    
}
