package hellicott.tvprices;

import org.junit.Assert;
import org.junit.Test;

public class TestCheapestPrice{
    @Test
    public void testCanFindCheapestPriceWhenAllUnique(){
        // arrange
        
        // assert
        Assert.assertEquals("Televizion", TvPrices.findCheapest("make", "model"));
    }
    
    
}
