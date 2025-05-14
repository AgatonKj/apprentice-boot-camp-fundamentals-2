package bowling;

import org.junit.Assert;
import org.junit.Test;

public class BowlingTest {
    @Test
    public void assertThatGutterGameEqualsZero() {
        int[] rolls =new int[] {0,0, 0,0, 0,0, 0,0, 0,0,
                        0,0, 0,0, 0,0, 0,0, 0,0};
        Bowling bowling = new Bowling();
        Assert.assertEquals(0,bowling.game(rolls));
    }

    @Test
    public void assertThatGameScoringOnesEqualsTwenty() {
        int[] rolls =new int[] {1,1, 1,1, 1,1, 1,1, 1,1,
                1,1, 1,1, 1,1, 1,1, 1,1};
        Bowling bowling = new Bowling();
        Assert.assertEquals(20,bowling.game(rolls));
    }
}
