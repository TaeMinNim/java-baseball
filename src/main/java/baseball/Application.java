package baseball;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;
public class Application {
    public static void main(String[] args) {

    }

    public static List<Integer> toIntegerList(String input){
        List<Integer> player = new ArrayList<>();
        for(int i = 0; i < input.length(); i++){
            int number = Character.getNumericValue(input.charAt(i));
            player.add(number);
        }

        return player;
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
