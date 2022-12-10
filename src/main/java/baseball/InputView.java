package baseball;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public Number printNumberInput(){
        System.out.print("숫자를 입력해주세요 : ");
        return new Number(Console.readLine());
    }
}
