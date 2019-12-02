package hellicott.rockpaperscissors;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestRockPaperScissors{
    
    @Test
    @Parameters({"1, rock, scissors", "1, scissors, paper", "1, paper, rock",
                 "2, scissors, rock", "2, paper, scissors", "2, rock, paper",
                 "0, rock, rock", "0, paper, paper", "0, scissors, scissors"})
    public void testCorrectPlayerWins(int expected, String player1, String player2){
        Assert.assertEquals(expected, vs(player1, player2));
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
