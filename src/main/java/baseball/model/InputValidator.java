package baseball.model;

import baseball.view.InputView;
import baseball.enums.Constant;
import static baseball.enums.ErrorMsg.*;

public class InputValidator {

    private static final String RETRY = "1";
    private static final String END = "2";

    public void validateGameNumber(String gameNumber) {
        validateTypeIsNumber(gameNumber);

        if (isNotThreeDigits(gameNumber)) {
            throw new IllegalArgumentException(ERROR_PREFIX.get() + ERROR_MSG_GAME_NUMBER_IS_NOT_THREE_DIGITS.get());
        }

        if (isNotEachDifferentNumber(gameNumber)) {
            throw new IllegalArgumentException(ERROR_PREFIX.get() + ERROR_MSG_GAME_NUMBER_IS_NOT_DUPLICATATE.get());
        }
    }

    public void validateRetry(String retry) {
        if (!retry.equals(RETRY) && !retry.equals(END)) {
            throw new IllegalArgumentException(ERROR_PREFIX.get() + ERROR_MSG_RETRY_IS_ONLY_1_OR_2.get());
        }
    }

    private void validateTypeIsNumber(String gameNumber) {
        try {
            Integer.parseInt(gameNumber);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException(ERROR_PREFIX.get() + ERROR_MSG_INPUT_IS_NOT_NUMBER.get());
        }
    }

    private boolean isNotThreeDigits(String gameNumber) {
        return !(gameNumber.length() == Constant.GAME_NUMBER_SIZE.get());
    }

    private boolean isNotEachDifferentNumber(String gameNumber) {
        int eachNumberCount = (int) gameNumber.chars()
                .distinct()
                .count();

        return !(eachNumberCount == Constant.GAME_NUMBER_SIZE.get());
    }
}
