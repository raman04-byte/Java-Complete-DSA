import java.util.Arrays;

public class LeetCode_1626 {
    public static void main(String[] args) {
        
    }
    
class Player{
        
    public int age;
    public int score;
    
    public Player(int age, int score){
        this.age = age;
        this.score = score;
    }

}


class Solution {
public int bestTeamScore(int[] scores, int[] ages) {
    
    Player[] players = new Player[scores.length];
    
    //group scores and ages in single data structure
    for(int i=0;i<players.length;i++){
        players[i] = new Player(ages[i],scores[i]);
    }
    
    //sort on the basis of ages, use score for breaking ties
    Arrays.sort(players, (player1,player2)->player1.age==player2.age?player1.score-player2.score:player1.age-player2.age);
    
    int dp[] = new int[players.length];
    
    //for one player, their score is max score.
    int max = dp[0] = players[0].score;
    
    for(int i=1;i<players.length;i++){
        
        dp[i] = players[i].score;
        //for one player their score is max score
        for(int j=0;j<i;j++){
            
            //for all player with ages less than this player
            if(players[j].score<=players[i].score){
                
                //if the score is less than this player than add the score till those player in case we included any of those players as well in the team
                
                //note we're maximizing the inclusion instead of straight up doing summation
                
                //because a player that is valid for this player might not be valid for another player that is also valid for this player
                
                //because dp[j] simple considers the case where it was the last player till that position and the score of the team after chosing that player and removing other players.
                
                //which means each dp[j] in itself is a valid answer till that point with all the info, so we just need to take the maximum
                
                //For the rest of the valid players which will lie ahead of it, second loop will handle the things.
                
                dp[i] = Math.max(dp[i],dp[j]+players[i].score);
                
            }
            
        }
        //maximize for the inclusion of every single player      
        max = Math.max(max,dp[i]);
        
    }
    
    
    
    return max;
}


}
}
