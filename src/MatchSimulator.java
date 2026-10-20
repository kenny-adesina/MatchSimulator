import java.util.*;

public class MatchSimulator {
    private Team team1, team2;
    private int score1, score2;


    public MatchSimulator(Team team1, Team team2){
         this.team1 = team1;

         this.team2 = team2;

    }

    public static void playMatch(Team a, Team b){
        int possession;

       // Regular Time
        for(int i = 1; i < 90 ; i++){

            possession = (int)(Math.round(Math.random()));
            int totalPossessionA = 0;
            int totalPossessionB = 0;

            if (possession == 0){
                totalPossessionA++;
                // Simulate chance (soon)
            } else {
                totalPossessionB++;
                // Simulate chance (soon)
            }
        }


    }
}
