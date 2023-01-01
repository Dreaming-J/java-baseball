package baseball.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidationCommandTest {

    @Test
    void 재시작_커맨드_입력_검증() {
        assertThat(RetryOption.from("1")).isEqualTo(RetryOption.RETRY);
        assertThat(RetryOption.from("2")).isEqualTo(RetryOption.QUIT);
        assertThatThrownBy(() -> RetryOption.from("3"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
