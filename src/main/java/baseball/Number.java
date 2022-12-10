package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number {
    public final static int STRIKE = 0;
    public final static int BALL = 1;

    private String number;

    public Number(String number){
        this.number = number;
    }

    public List<Integer> compare(Number other){
        int contain = countContain(other);
        int strike = countStrike(other);
        int ball = contain - strike;

        return new ArrayList<>(Arrays.asList(strike, ball));
    }

    private int countContain(Number other){
        int contain = 0;
        for(int i = 0; i < number.length(); i++){
            String digit = String.valueOf(number.charAt(i));
            if(other.number.contains(digit)) {
                contain++;
            }
        }

        return contain;
    }

    private int countStrike(Number other){
        int strike = 0;
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == other.number.charAt(i)) {
                strike++;
            }
        }

        return strike;
    }
}
