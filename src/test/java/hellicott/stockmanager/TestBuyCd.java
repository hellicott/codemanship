package hellicott.stockmanager;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
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
        CD cd = new CD(2);
        StockManager stockManager = new StockManager(pt);
        // act
        cd.buy(pt);
        // assert
        Assert.assertEquals(1, cd.getStock());
    }
    
    class StockManager{
        StockManager(PaymentThing pt){
    
        }
    }
    
    class CD{
        private int stock;
        
        CD(int stock){
            this.stock = stock;
        }
        
        void buy(PaymentThing pt){
            this.stock--;
        }
        
        int getStock(){
            return this.stock;
        }
        
        boolean inStock(){
            return true;
        }
    }
    
    class PaymentThing{
        boolean paymentAccepted(){
            return true;
        }
    }
}
