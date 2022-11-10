package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.List;

public class JudgmentTest {
    private Judgment judgment;
    private List<Integer> computer = List.of(4, 2, 5);

    @DisplayName("countMatchNumber 메소드 테스트")
    @Nested
    class countMatchNumberTest {
        @BeforeEach
        void setup(){
            judgment = new Judgment();
        }

        @DisplayName("0개 일치")
        @Test
        void nothing() {
            List<Integer> player = List.of(7, 8, 9);
            int result = 0;

            int actual = judgment.countMatchNumber(computer, player);
            assertThat(actual).isEqualTo(result);
        }

        @DisplayName("1개 일치")
        @Test
        void oneMatch() {
            List<Integer> player = List.of(4, 8, 9);
            int result = 1;

            int actual = judgment.countMatchNumber(computer, player);
            assertThat(actual).isEqualTo(result);
        }

        @DisplayName("2개 일치")
        @Test
        void twoMatch() {
            List<Integer> player = List.of(4, 2, 9);
            int result = 2;

            int actual = judgment.countMatchNumber(computer, player);
            assertThat(actual).isEqualTo(result);
        }

        @DisplayName("3개 일치")
        @Test
        void threeMatch() {
            List<Integer> player = List.of(4, 2, 5);
            int result = 3;

            int actual = judgment.countMatchNumber(computer, player);
            assertThat(actual).isEqualTo(result);
        }
    }
}
