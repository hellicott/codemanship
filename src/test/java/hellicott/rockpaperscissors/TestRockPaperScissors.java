package hellicott.rockpaperscissors;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestRockPaperScissors{
    
    @Test
    @Parameters({"1, rock, scissors", "2, scissors, rock"})
    public void testRockBeatsScissors(int expected, String player1, String player2){
        Assert.assertEquals(expected, new RockPaperScissors().vs(player1, player2));
    }
    
    @Test
    @Parameters({"1, scissors, paper", "2, paper, scissors"})
    public void testScissorsBeatsPaper(int expected, String player1, String player2){
        Assert.assertEquals(expected, new RockPaperScissors().vs(player1, player2));
    }
    
    @Test
    @Parameters({"1, paper, rock", "2, rock, paper"})
    public void testPaperBeatsRock(int expected, String player1, String player2){
        Assert.assertEquals(expected, new RockPaperScissors().vs(player1, player2));
    }
    
    @Test
    @Parameters({"rock, rock", "paper, paper", "scissors, scissors"})
    public void testDrawReturns0(String player1, String player2){
        Assert.assertEquals(0, new RockPaperScissors().vs(player1, player2));
    }
    
}
