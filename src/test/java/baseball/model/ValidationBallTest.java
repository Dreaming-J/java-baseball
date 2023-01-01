package baseball.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ValidationBallTest {

    @Test
    void 야구_숫자_1_9_검증() {
        assertDoesNotThrow(() -> new Ball(0, 9));
        assertDoesNotThrow(() -> new Ball(0, 1));
        assertThatThrownBy(() -> new Ball(0, 0))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Ball(0, 10))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 야구_숫자_중복_없는_3자리_검증() {
        assertDoesNotThrow(() -> new Balls(List.of(1, 2, 3)));
        assertThatThrownBy(() -> new Balls(List.of(1, 1, 2)))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Balls(List.of(1, 2, 3, 4)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
