package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.List;

public class RefereeTest {
    private Referee referee;
    private List<Integer> computer = List.of(4, 2, 5);

    @BeforeEach
    void setup(){
        referee = new Referee();
    }

    @DisplayName("compare 메소드 테스트")
    @Nested
    class compareTest{
        @DisplayName("낫싱")
        @Test
        void nothing() {
            List<Integer> player = List.of(7, 8, 9);
            String result = "낫싱";

            String actual = referee.compare(computer, player);
            assertThat(actual).isEqualTo(result);
        }

        @DisplayName("3스트라이크")
        @Test
        void threeStrike() {
            List<Integer> player = List.of(4, 2, 5);
            String result = "3스트라이크";

            String actual = referee.compare(computer, player);
            assertThat(actual).isEqualTo(result);
        }

        @DisplayName("2볼 1스트라이크")
        @Test
        void twoBallOneStrike() {
            List<Integer> player = List.of(5, 2, 4);
            String result = "2볼 1스트라이크";

            String actual = referee.compare(computer, player);
            assertThat(actual).isEqualTo(result);
        }

        @DisplayName("3볼")
        @Test
        void threeBall() {
            List<Integer> player = List.of(5, 4, 2);
            String result = "3볼";

            String actual = referee.compare(computer, player);
            assertThat(actual).isEqualTo(result);
        }
    }
}
