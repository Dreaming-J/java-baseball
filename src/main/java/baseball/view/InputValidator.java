package baseball.view;

import baseball.enums.RetryOption;
import baseball.module.NotModule;

import java.util.List;

public class InputValidator  extends NotModule {

    private static final String MSG_EACH_DIGITS_IS_NOT_BETWEEN_1_AND_9 = "각 자리수는 1~9 사이의 숫자로 입력해주세요.";
    private static final String MSG_USER_NUMBER_IS_NOT_EACH_ANOTHER_THREE_DIGITS = "서로 다른 세자리의 숫자로 입력해주세요.";
    private static final String MSG_RETRY_IS_NOT_ONE_OR_TWO = "선택할 수 없는 기능입니다.";
    private static final int NUMBER_SIZE = 3;
    private static final int LOWER_NUMBER_INCLUSIVE = 1;
    private static final int UPPER_NUMBER_INCLUSIVE = 9;

    public void validateUserNumber(List<Integer> input) {
        checkAnotherThreeDigits(input);
        checkNumberRange(input);
    }

    private void checkAnotherThreeDigits(List<Integer> input) {
        int distinctSize = (int) input.stream()
                .distinct()
                .count();
        if (distinctSize != NUMBER_SIZE) {
            throw new IllegalArgumentException(MSG_USER_NUMBER_IS_NOT_EACH_ANOTHER_THREE_DIGITS);
        }
    }

    private void checkNumberRange(List<Integer> input) {
        int inRangeSize = (int) input.stream()
                .filter(number -> number >= LOWER_NUMBER_INCLUSIVE && number <= UPPER_NUMBER_INCLUSIVE)
                .count();
        if (inRangeSize != NUMBER_SIZE) {
            throw new IllegalArgumentException(MSG_EACH_DIGITS_IS_NOT_BETWEEN_1_AND_9);
        }
    }

    public void validateRetry(String input) {
        if (not(RetryOption.contains(input))) {
            throw new IllegalArgumentException(MSG_RETRY_IS_NOT_ONE_OR_TWO);
        }
    }
}
