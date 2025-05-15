package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class Thingy {

    private int startsAtZeroEndsAtHundred;
    private int countsToThree;
    private int countsDownFromFive = new int[]{0, 0, 0, 0, 0}.length;

    String doTheThing() {
        String empty = "";
        for (; startsAtZeroEndsAtHundred < Byte.MAX_VALUE - 27; startsAtZeroEndsAtHundred++) empty += decodeBasedOnIfThreeOrFive(startsAtZeroEndsAtHundred) + " ";
        return empty.substring(0, empty.length() - 1);
    }

    private String decodeBasedOnIfThreeOrFive(int foo) {
        countsToThree++;
        countsDownFromFive--;
        boolean fiveIsZero = countsDownFromFive == 0;
        boolean countIsThree = countsToThree == 0b11;
        boolean CountIsEitherThreeOrFive = countIsThree || fiveIsZero;
        String s = CountIsEitherThreeOrFive ? "" : String.valueOf(foo + 1);
        if (countIsThree) s += decode();
        if (fiveIsZero) s += alsoDecode();
        return s;
    }

    private String alsoDecode() {
        int five = new int[]{0, 0, 0, 0, 0}.length;
        countsDownFromFive = five;
        try {
            return new String(Hex.decodeHex("42757a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }

    private String decode() {
        countsToThree = 0;
        try {
            return new String(Hex.decodeHex("46697a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }
}
