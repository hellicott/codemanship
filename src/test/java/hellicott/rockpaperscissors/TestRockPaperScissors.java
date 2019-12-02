package hellicott.rockpaperscissors;

import hellicott.rockpaperscissors.RockPaperScissors.RPS;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestRockPaperScissors{
    
    @Test
    @Parameters({"1, ROCK, SCISSORS", "2, SCISSORS, ROCK"})
    public void testRockBeatsScissors(int expected, RPS player1, RPS player2){
        Assert.assertEquals(expected, new RockPaperScissors().vs(player1, player2));
    }
    
    @Test
    @Parameters({"1, SCISSORS, PAPER", "2, PAPER, SCISSORS"})
    public void testScissorsBeatsPaper(int expected, RPS player1, RPS player2){
        Assert.assertEquals(expected, new RockPaperScissors().vs(player1, player2));
    }
    
    @Test
    @Parameters({"1, PAPER, ROCK", "2, ROCK, PAPER"})
    public void testPaperBeatsRock(int expected, RPS player1, RPS player2){
        Assert.assertEquals(expected, new RockPaperScissors().vs(player1, player2));
    }
    
    @Test
    @Parameters({"ROCK, ROCK", "PAPER, PAPER", "SCISSORS, SCISSORS"})
    public void testDrawReturns0( RPS player1, RPS player2){
        Assert.assertEquals(0, new RockPaperScissors().vs(player1, player2));
    }
    
}
