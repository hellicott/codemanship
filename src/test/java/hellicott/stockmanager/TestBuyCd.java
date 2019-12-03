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
        Payment pt = new PaymentStub(true);
        CD cd = new CD(2, "", "");
        // act
        cd.buy(pt);
        // assert
        Assert.assertEquals(1, cd.getStock());
    }
    
    @Test
    public void testBuyWhenPaymentRejected(){
        // arrange
        Payment pt = new PaymentStub(false);
        CD cd = new CD(2, "", "");
        // act
        cd.buy(pt);
        // assert
        Assert.assertEquals(2, cd.getStock());
    }
    
    @Test
    public void testBuyWhenNotInStock(){
        // arrange
        Payment pt = new PaymentStub(true);
        CD cd = new CD(0, "", "");
        // act
        cd.buy(pt);
        // assert
        Assert.assertEquals(0, cd.getStock());
    }
    
    static class PaymentStub implements Payment{
        private boolean accepted;
        
        PaymentStub(boolean paymentAccepted){
            this.accepted = paymentAccepted;
        }
        
        public boolean paymentAccepted(){
            return this.accepted;
        }
    }
    
}
