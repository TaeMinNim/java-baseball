package baseball;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }

    public static boolean isValidData(List<Integer> player){
        if(player.size() != 3){
            throw new IllegalArgumentException();
        }

        List<Integer> notOverlap = new ArrayList<>();
        for(int number: player){
            if(number == 0){
                throw new IllegalArgumentException();
            }

            if(!notOverlap.contains(number)){
                notOverlap.add(number);
            } else{
                throw new IllegalArgumentException();
            }
        }
        return true;
    }
}
