package hellicott.tvprices;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestCheapestPrice{
    private Retailer t;
    private Retailer sb;
    private Retailer atv;
    private TvPrices tvPrices;
    
    @Before
    public void setUp(){
        // arrange
        t = new RetailerStub(2.99);
        sb = new RetailerStub(277);
        atv = new RetailerStub(25.55);
        tvPrices = new TvPrices(new Retailer[]{t, sb, atv});
    }
    
    @Test
    public void testCanFindCheapestPriceWhenAllUnique(){
        Assert.assertTrue(tvPrices.findCheapest("make", "model").contains(t));
    }
    
    @Test
    public void testFindCheapestWhenUnique(){
        Assert.assertEquals(1, tvPrices.findCheapest("make", "model").size());
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
