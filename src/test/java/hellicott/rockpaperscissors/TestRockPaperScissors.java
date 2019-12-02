package hellicott.rockpaperscissors;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestRockPaperScissors{
    
    @Test
    @Parameters({"rock, scissors", "scissors, paper"})
    public void testCorrectPlayerWins(String player1, String player2){
        // arrange
        
        // act
        
        // assert
        Assert.assertEquals(1, vs(player1, player2));
    }
    
    @Test
    public void testPlayerTwoWins(){
        // arrange
        
        // act
        
        // assert
        Assert.assertEquals(2, vs("scissors", "rock"));
    }
    
    
    
    private int vs(String player1, String player2){
        if(player2.equals("rock")){
            return 2;
        }
        return 1;
    }
}
