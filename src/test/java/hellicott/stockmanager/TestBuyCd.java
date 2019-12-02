package hellicott.stockmanager;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestBuyCd{
    @Test
    @Parameters({"true, 2, 1", "false, 2, 2", "true, 0, 0", "false, 0, 0"})
    public void testBuy(final boolean paymentAccepted, int stock, int expected){
        // arrange
        PaymentThing pt = new PaymentThing(){
            @Override
            boolean paymentAccepted(){
                return paymentAccepted;
            }
        };
        CD cd = new CD(stock);
        // act
        cd.buy(pt);
        // assert
        Assert.assertEquals(expected, cd.getStock());
    }
    
    @Test
    public void testBuyWhenPaymentAcceptedAndInStock(){
        // arrange
        PaymentThing pt = new PaymentThing(){
            @Override
            boolean paymentAccepted(){
                return true;
            }
        };
        CD cd = new CD(2);
        // act
        cd.buy(pt);
        // assert
        Assert.assertEquals(1, cd.getStock());
    }
    
    @Test
    public void testBuyWhenPaymentRejected(){
        // arrange
        PaymentThing pt = new PaymentThing(){
            @Override
            boolean paymentAccepted(){
                return false;
            }
        };
        CD cd = new CD(2);
        // act
        cd.buy(pt);
        // assert
        Assert.assertEquals(2, cd.getStock());
    }
    
    @Test
    public void testBuyWhenNotInStock(){
        // arrange
        PaymentThing pt = new PaymentThing(){
            @Override
            boolean paymentAccepted(){
                return true;
            }
        };
        CD cd = new CD(0);
        // act
        cd.buy(pt);
        // assert
        Assert.assertEquals(0, cd.getStock());
    }
    
}
