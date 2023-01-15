package baseball.utils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TypeConverter {

    private static final String MSG_USER_NUMBER_IS_NOT_NUMBER_TYPE = "입력은 숫자만 가능합니다.";
    private static final String BLANK = "";

    public static List<Integer> convertStringToIntList(String data) {
        try {
            return Stream.of(data.split(BLANK))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(MSG_USER_NUMBER_IS_NOT_NUMBER_TYPE);
        }
    }
}
