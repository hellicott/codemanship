package hellicott.stockmanager;

import org.junit.Assert;
import org.junit.Test;

public class TestSearchCds{
    @Test
    public void testInCatalogue(){
        // arrange
        CdInfo cd = new CD(2, "", "");
        String[] cdInfo = {"Ain't no party like an S Club Party", "S Club 7"};
        PaymentThing pt = new PaymentThing();
        StockManager stockManager = new StockManager(pt);
        // assert
        Assert.assertEquals(true, stockManager.inCatalogue(cdInfo));
    }
    
    
}
