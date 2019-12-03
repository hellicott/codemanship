package hellicott.stockmanager;

import org.junit.Assert;
import org.junit.Test;

public class TestSearchCds{
    @Test
    public void testInCatalogue(){
        // arrange
        ICD cd = new ICD();
        PaymentThing pt = new PaymentThing();
        StockManager stockManager = new StockManager(pt);
        // assert
        Assert.assertEquals(true, stockManager.inCatalogue());
    }
    
    
}
