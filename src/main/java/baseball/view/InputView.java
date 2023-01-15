package baseball.view;

import baseball.utils.TypeConverter;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {

    private static final String MSG_INPUT_NUMBER = "숫자를 입력해주세요 : ";
    private static final String MSG_INPUT_RETRY = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private final InputValidator inputValidator = new InputValidator();

    public List<Integer> readUserNumber() {
        System.out.print(MSG_INPUT_NUMBER);
        List<Integer> userNumber = TypeConverter.convertStringToIntList(Console.readLine());
        inputValidator.validateUserNumber(userNumber);

        return userNumber;
    }

    public String readRetry() {
        System.out.println(MSG_INPUT_RETRY);
        String retry = Console.readLine();
        inputValidator.validateRetry(retry);

        return retry;
    }
}
