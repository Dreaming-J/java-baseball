package baseball.model;

import java.util.Objects;
import java.util.stream.Stream;

public enum RetryOption {
    RETRY("1"),
    QUIT("2");

    private static final String WRONG_COMMAND_INPUT = "입력 커맨드는 1과 2만 입력가능합니다.";
    private final String command;

    RetryOption(String command) {
        this.command = command;
    }

    public static RetryOption from(String command) {
        return Stream.of(values())
                .filter(option -> Objects.equals(option.command, command))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(WRONG_COMMAND_INPUT));
    }

    public boolean isRetry() {
        return this == RETRY;
    }
}
