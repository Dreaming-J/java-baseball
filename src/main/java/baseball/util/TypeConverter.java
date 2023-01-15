package baseball.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TypeConverter {

    private static final String BLANK = "";
    private static final String WRONG_DATA_INPUT_FORMAT = "올바른 형식으로 입력해주세요.";

    public static List<Integer> toList(String input) {
        try {
            return Stream.of(input.split(BLANK))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(WRONG_DATA_INPUT_FORMAT);
        }
    }
}
