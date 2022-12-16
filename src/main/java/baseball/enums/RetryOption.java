package baseball.enums;

import java.util.stream.Stream;

public enum RetryOption {
    RETRY("1"),
    END("2");

    private final String command;

    RetryOption(String command) {
        this.command = command;
    }

    public String get() {
        return this.command;
    }

    public static boolean contains(String command) {
        return Stream.of(values())
                .anyMatch(option -> option.command.equals(command));
    }
}
