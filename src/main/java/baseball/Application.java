package baseball;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }

    public static boolean isValidData(List<Integer> player){
        for(int i = 0; i < player.size(); i++){
            int number = player.get(i);
            if(i == player.lastIndexOf(number)){
                throw new IllegalArgumentException();
            }
        }
        return true;
    }
}
