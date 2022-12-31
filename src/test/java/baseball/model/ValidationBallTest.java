package baseball.model;

import org.junit.jupiter.api.Test;

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
}
