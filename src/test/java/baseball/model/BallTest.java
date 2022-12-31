package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 4);
    }

    @Test
    void strike() {
        assertThat(com.play(new Ball(1, 4))).isEqualTo(BallStataus.STRIKE);
    }

    @Test
    void ball() {
        assertThat(com.play(new Ball(2, 4))).isEqualTo(BallStataus.BALL);
    }

    @Test
    void nothing() {
        assertThat(com.play(new Ball(2, 5))).isEqualTo(BallStataus.NOTHING);
    }
}
