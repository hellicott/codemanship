package hellicott.rockpaperscissors;

public class RockPaperScissors{
    int vs(String player1, String player2){
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
