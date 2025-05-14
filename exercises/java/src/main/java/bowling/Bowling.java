package bowling;

public class Bowling {
    public int game(int[] rolls) {
        int score = 0;
        for (int  i = 0; i < rolls.length; i++ ){
            score += rolls[i];
        }
        return score;
    }
}
