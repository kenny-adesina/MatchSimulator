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

    // WIP (determines goal with stats)
    public boolean shotToGoal(int possession,int t1a, int t2d){
        int c = ((int)(Math.random()*(8))+1);
        int d = (int)(Math.random()*3)+(int)(Math.random()*((double)t1a/t2d));
        c += d;


        if (c >= 9){
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
        float stoppage = 0;

         // NOTE: In the future I might change this to be split into TWO halves.
        // Regular Time
        for(int i = 1; i <= 90 ; i++){
            possession = (int)(Math.round(Math.random()));
            chance = (int)(Math.random()*(10-1+1))+1;
            randShot = (int)(Math.random()*30)+1;
            stoppage+=(float)(Math.random()*0.10);
            if (possession == 0){
                totalPossessionA++;
                 if (chance == 10){
                   shotToGoal(possession,team1.getAttack() + (team1.getMidfield()/2),team2.getDefense() + (team2.getMidfield()/2));
                   shotsA++;
                 }
            } else {
                totalPossessionB++;
                if (chance == 10){
                    shotToGoal(possession,team2.getAttack() + (team2.getMidfield()/2),team1.getDefense() + (team1.getMidfield()/2));
                    shotsB++;
                }
            }
            if(randShot == 30){
                shotToGoal(possession);
                if(possession == 0){
                    shotsA++;
                } else {
                    shotsB++;
                }
            }
        }

        // Stoppage Time
        for(int i = 0; i < Math.round(stoppage); i++){
            possession = (int)(Math.round(Math.random()));
            chance = (int)(Math.random()*(10-1+1))+1;
            randShot = (int)(Math.random()*30)+1;
            if (possession == 0){
                totalPossessionA++;
                if (chance == 10){
                    shotToGoal(possession,team1.getAttack() + (team1.getMidfield()/2),team2.getDefense() + (team2.getMidfield()/2));
                    shotsA++;
                }
            } else {
                totalPossessionB++;
                if (chance == 10){
                    shotToGoal(possession,team2.getAttack() + (team2.getMidfield()/2),team1.getDefense() + (team1.getMidfield()/2));
                    shotsB++;
                }
            }
            if(randShot == 30){
                shotToGoal(possession);
                if(possession == 0){
                    shotsA++;
                } else {
                    shotsB++;
                }
            }
        }

        // -- Debugging -- \\
        System.out.println(team1.getLeague());
       System.out.println(team1.getName()+" : "+score1);
        System.out.println(team2.getName()+" : "+score2);



    }
}
