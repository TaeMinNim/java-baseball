package baseball;

import java.util.List;

public class Judgment {
    public int countMatchNumber(List<Integer> computer, List<Integer> player){
        int count = 0;
        for(int i = 0; i < player.size(); i++){
            int number = player.get(i);
            if(computer.contains(number)){
                count++;
            }
        }

        return count;
    }

    public boolean hasPlace(List<Integer> computer, int number, int index){
        return computer.get(index) == number;
    }
}
