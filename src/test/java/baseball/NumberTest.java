package baseball;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

public class NumberTest {
    private final Number computer = new Number("425");
    @ParameterizedTest
    @MethodSource("generateData")
    void compareTest(String number, List<Integer> result){
        Number player = new Number(number);
        List<Integer> actual = computer.compare(player);
        assertThat(actual).isEqualTo(result);
    }

    static Stream<Arguments> generateData(){
        return Stream.of(
                Arguments.of("136", List.of(0, 0)), // NOTING
                Arguments.of("123", List.of(1, 0)), // 1 STRIKE
                Arguments.of("125", List.of(2, 0)), // 2 STRIKE
                Arguments.of("425", List.of(3, 0)), // 3 STRIKE
                Arguments.of("132", List.of(0, 1)), // 1 BALL
                Arguments.of("142", List.of(0, 2)), // 2 BALL
                Arguments.of("542", List.of(0, 3)), // 3 BALL
                Arguments.of("524", List.of(1, 2)) // 1 STRIKE 2 BALL
            );
    }
}
