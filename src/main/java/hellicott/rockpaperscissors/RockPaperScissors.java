package hellicott.rockpaperscissors;

class RockPaperScissors{
    enum RPS{
        ROCK, PAPER, SCISSORS
    }
    enum Winner{
        DRAW, PLAYER1, PLAYER2
    }
    
    Winner[][] resultMap= {
            //P2 ROCK,        PAPER,          SCISSORS
            {Winner.DRAW, Winner.PLAYER2, Winner.PLAYER1}, //P1 ROCK
            {Winner.PLAYER1, Winner.DRAW, Winner.PLAYER2}, //P1 PAPER
            {Winner.PLAYER2, Winner.PLAYER1, Winner.DRAW} //P1 SCISSORS
    };
    
    int vs(RPS player1, RPS player2){
        return resultMap[player1.ordinal()][player2.ordinal()].ordinal();
    }
}
