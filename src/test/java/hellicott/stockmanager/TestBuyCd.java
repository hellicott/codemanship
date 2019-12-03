package hellicott.stockmanager;

import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestBuyCd{
    
    @Test
    public void testBuyWhenPaymentAcceptedAndInStock(){
        // arrange
        PaymentThing pt = new PaymentThing(){
            @Override
            boolean paymentAccepted(){
                return true;
            }
        };
        CD cd = new CD(2, "", "");
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
        CD cd = new CD(2, "", "");
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
        CD cd = new CD(0, "", "");
        // act
        cd.buy(pt);
        // assert
        Assert.assertEquals(0, cd.getStock());
    }
    
}
