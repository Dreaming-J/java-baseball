package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Balls answers;

    @BeforeEach
    void setUp() {
        answers = new Balls(List.of(1, 2, 3));
    }

    @Test
    void play_3strike() {
        PlayResult result = answers.play(List.of(1,2,3));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.isContinue()).isFalse();
    }

    @Test
    void play_2strike() {
        PlayResult result = answers.play(List.of(1,2,5));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(2);
    }

    @Test
    void play_2ball_1strike() {
        PlayResult result = answers.play(List.of(1,3,2));
        assertThat(result.getBall()).isEqualTo(2);
        assertThat(result.getStrike()).isEqualTo(1);
    }

    @Test
    void play_1ball_1strike() {
        PlayResult result = answers.play(List.of(1,3,6));
        assertThat(result.getBall()).isEqualTo(1);
        assertThat(result.getStrike()).isEqualTo(1);
    }

    @Test
    void play_nothing() {
        PlayResult result = answers.play(List.of(4,5,6));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(0);
    }

    @Test
    void strike() {
        assertThat(answers.play(new Ball(0, 1))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        assertThat(answers.play(new Ball(0, 2))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        assertThat(answers.play(new Ball(0, 4))).isEqualTo(BallStatus.NOTHING);
    }
}
