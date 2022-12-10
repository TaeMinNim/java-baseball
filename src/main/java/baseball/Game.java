package baseball;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Number computer;

    public Game(){
        this.computer = new Number(generateNumber());
    }

    private String generateNumber(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        String number = "";
        for(int i = 0; i < computer.size(); i++){
            number += String.valueOf(computer.get(i));
        }

        return number;
    }
}
