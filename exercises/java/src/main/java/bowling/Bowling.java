package bowling;

public class Bowling {
    public int game(int[] rolls) {
        int score = 0;
        for (int  i = 0; i < rolls.length; i+=2 ){
            int set = 0;
            set += rolls[i];
            set += rolls[i+1];
            if (set == 10){
                set += rolls[i+2];
            }
            score += set;
        }
        return score;
    }
}