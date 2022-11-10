package baseball;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;
public class Application {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Referee referee = new Referee();

        System.out.println("숫자 야구 게임을 시작합니다.");

        String choice = "1";
        while(choice.equals("1")) {
            List<Integer> computer = numberGenerator.createNumber();
            String result = "";
            while (!result.equals("3스트라이크")) {
                System.out.println("숫자를 입력해주세요 : ");
                String input = Console.readLine();
                List<Integer> player = toIntegerList(input);
                isValidData(player);

                result = referee.compare(computer, player);
                System.out.println(result);
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            choice = Console.readLine();
        }
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
