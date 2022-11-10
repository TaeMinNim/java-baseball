package baseball;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player){
        Judgment judgment = new Judgment();
        int matchNumber = judgment.countMatchNumber(computer, player);

        int strike = 0;
        for(int index = 0; index < player.size(); index++){
            int number = player.get(index);
            if(judgment.hasPlace(computer, number, index)){
                strike++;
            }
        }

        int ball = matchNumber - strike;
        String result = "";
        if(matchNumber == 0){
            result = "낫싱";
        }
        if(strike > 0){
            result = strike + "스트라이크";
        }
        if(ball > 0){
            result = ball + "볼";
        }
        if(ball > 0 && strike > 0){
            result = ball + "볼 " + strike + "스트라이크";
        }

        return result;
    }
}
