package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class Thingy {

    private int countToHundred;
    private int countsToThree;
    private int countsDownFromFive = new int[]{0, 0, 0, 0, 0}.length;

    String playFizzBuzz() {
        String empty = "";
        for (; countToHundred < Byte.MAX_VALUE - 27; countToHundred++) empty += nextFizzBuzzValue(countToHundred) + " ";
        return empty.substring(0, empty.length() - 1);
    }

    private String nextFizzBuzzValue(int count) {
        countsToThree++;
        countsDownFromFive--;
        int zero = 0;
        int three = 0b11;
        boolean countReachedThree = countsToThree == three;
        boolean FiveReachedZero = countsDownFromFive == zero;
        boolean CountIsEitherThreeOrFive = countReachedThree || FiveReachedZero;
        String s = getNumbersNotFizzBuzz(count, CountIsEitherThreeOrFive);
        if (countReachedThree) s += decodeThree();
        if (FiveReachedZero) s += decodeFive();
        return s;
    }

    private String getNumbersNotFizzBuzz(int foo, boolean CountIsEitherThreeOrFive) {
        return CountIsEitherThreeOrFive ? "" : String.valueOf(foo + 1);
    }

    private String decodeHex(String hex) {
        try {
            return new String(Hex.decodeHex(hex), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }

    private String decodeFive() {
        int five = new int[]{0, 0, 0, 0, 0}.length;
        countsDownFromFive = five;
        String fizzHex = "42757a7a";
        return decodeHex(fizzHex);
    }

    private String decodeThree() {
        countsToThree = 0;
        String buzzHex = "46697a7a";
        return decodeHex(buzzHex);
    }
}
