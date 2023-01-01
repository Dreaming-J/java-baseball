package baseball.view;

import baseball.model.RetryOption;
import baseball.util.TypeConverter;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {

    private static final String BALL_NUMBER_INPUT_MSG = "숫자를 입력해주세요 : ";
    private static final String RETRY_INPUT_MSG = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public List<Integer> readBallNumber() {
        System.out.print(BALL_NUMBER_INPUT_MSG);
        return TypeConverter.toList(Console.readLine());
    }

    public RetryOption readRetryCommand() {
        System.out.println(RETRY_INPUT_MSG);
        return RetryOption.from(Console.readLine());
    }
}
