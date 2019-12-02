package hellicott.stockmanager;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestBuyCd{
    @Test
    @Parameters({})
    public void testBuyWhenPaymentAcceptedAndInStock(){
        // arrange
        PaymentThing pt = new PaymentThing();
        CD cd = new CD();
        StockManager stockManager = new StockManager(pt);
        
        int originalStock = cd.getStock();
        // act
        stockManager.buy(cd, pt);
        // assert
        Assert.assertEquals(originalStock -1, cd.getStock());
    }
    
    class StockManager{
        StockManager(PaymentThing pt){
        
        }
        void buy(CD cd, PaymentThing pt){
        
        }
    }
    
    class CD{
        int getStock(){
            return 1;
        }
        
        boolean inStock(){
            return true;
        }
    }
    
    class PaymentThing{
        boolean paymentAccepted(){
            return True;
        }
    }
}
