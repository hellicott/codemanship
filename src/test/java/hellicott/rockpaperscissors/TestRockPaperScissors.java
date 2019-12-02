package hellicott.rockpaperscissors;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestRockPaperScissors{
    
    @Test
    @Parameters({"rock, scissors", "scissors, paper", "paper, rock"})
    public void testCorrectPlayerWins(String player1, String player2){
        Assert.assertEquals(1, vs(player1, player2));
    }
    
    @Test
    @Parameters({"scissors, rock", "paper, scissors", "rock, paper"})
    public void testPlayerTwoWins(String player1, String player2){
        Assert.assertEquals(2, vs(player1, player2));
    }
    
    @Test
    public void testReturnsZeroWhenDraw(){
        Assert.assertEquals(0, vs("rock", "rock"));
    }
    
    
    
    private int vs(String player1, String player2){
        
        if(player1.equals(player2)){
            return 0;
        }
        if(player1.equals("scissors")){
            if(player2.equals("rock")){
                return 2;
            }
        }
        if(player1.equals("paper")){
            if((player2.equals("scissors"))){
                return 2;
            }
        }
        if(player1.equals("rock")){
            if(player2.equals("paper")){
                return 2;
            }
        }
        return 1;
    }
}
