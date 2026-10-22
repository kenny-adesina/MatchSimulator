import java.util.*;

public class MatchSimulator {

    private Team team1, team2;
    private int score1, score2;


    public MatchSimulator(Team team1, Team team2){
         this.team1 = team1;

         this.team2 = team2;

    }
    public boolean shotToGoal(int possession){
        int c = (int)(Math.random()*(9))+1;
        if (c == 9){
            if(possession == 0){
                score1++;
            } else if(possession == 1) {
                score2++;
            } else {
                System.out.print("Can only use integers 0 and 1.");
            }
            return true;
        }
        return false;
    }

    // This currently doesn't use the team's stats to determine the chance for a goal
    public void playMatch(Team a, Team b){
        int possession;
        int chance;
        int shotsA=0;
        int shotsB=0;
        int randShot;
        int totalPossessionA = 0;
        int totalPossessionB = 0;


        // Regular Time
        for(int i = 1; i <= 90 ; i++){

            possession = (int)(Math.round(Math.random()));
            chance = (int)(Math.random()*(10-1+1))+1;
            randShot = (int)(Math.random()*30)+1;

            if (possession == 0){
                totalPossessionA++;
                 if (chance == 10){
                   shotToGoal(possession);
                   shotsA++;
                 }
            } else {
                totalPossessionB++;
                if (chance == 10){
                    shotToGoal(possession);
                    shotsB++;
                }
            }
        }


    }
}
