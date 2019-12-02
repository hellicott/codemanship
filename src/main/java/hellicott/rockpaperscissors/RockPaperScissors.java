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
        if(player1.equals(player2)){
            return 0;
        }
        if(player1.equals(RPS.SCISSORS)){
            if(player2.equals(RPS.ROCK)){
                return 2;
            }
        }
        if(player1.equals(RPS.PAPER)){
            if((player2.equals(RPS.SCISSORS))){
                return 2;
            }
        }
        if(player1.equals(RPS.ROCK)){
            if(player2.equals(RPS.PAPER)){
                return 2;
            }
        }
        return 1;
    }
}
