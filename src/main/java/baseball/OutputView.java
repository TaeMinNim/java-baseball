package baseball;

import java.util.List;

public class OutputView {
    public void printResult(List<Integer> result){
        int strike = result.get(Number.STRIKE);
        int ball = result.get(Number.BALL);

        if(strike == 0 && ball == 0){
            System.out.println("낫싱");
        } else if(strike > 0 && ball > 0){
            System.out.println(ball + "볼 " + strike + "스트라이크");
        } else if(strike > 0){
            System.out.println(strike + "스트라이크");
        } else if(ball > 0){
            System.out.println(ball + "볼");
        }
    }
}
