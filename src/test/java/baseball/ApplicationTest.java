package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    @Test
    void 게임종료_후_재시작() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "135", "1", "597", "589", "2");
                    assertThat(output()).contains("낫싱", "3스트라이크", "1볼 1스트라이크", "3스트라이크", "게임 종료");
                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1234"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("isValidData 메소드 테스트")
    @Nested
    class isValidDataTest{
        @DisplayName("중복되는 숫자가 있는 경우")
        @Test
        void overlap() {
            List<Integer> player = List.of(4, 4, 5);

            assertThatThrownBy(() -> Application.isValidData(player))
                    .isInstanceOf(IllegalArgumentException.class);
        }

        @DisplayName("0이 포함된 경우")
        @Test
        void includeZero() {
            List<Integer> player = List.of(4, 0, 5);

            assertThatThrownBy(() -> Application.isValidData(player))
                    .isInstanceOf(IllegalArgumentException.class);
        }

        @DisplayName("3자리가 아닌 경우")
        @Test
        void notThreeFigures() {
            List<Integer> player = List.of(4, 5);

            assertThatThrownBy(() -> Application.isValidData(player))
                    .isInstanceOf(IllegalArgumentException.class);
        }
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
