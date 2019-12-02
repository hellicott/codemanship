package hellicott.fibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class TestFibonacci{
    @Test
    @Parameters({"0", "1"})
    public void firstTwoNumbersSameAsIndex(int index){
        Assert.assertEquals(index, new Fibonacci().fibonacciAt(index));
    }
    
    @Test
    @Parameters({"2, 1", "3, 2", "5,5"})
    public void testThirdNumberIsOne(int index, int expected){
        Assert.assertEquals(expected, new Fibonacci().fibonacciAt(index));
    }
    
}
