package baseball.view;

import baseball.util.TypeConverter;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {

    private static final String BALL_NUMBER_INPUT_MSG = "숫자를 입력해주세요 : ";

    public List<Integer> readBallNumber() {
        System.out.print(BALL_NUMBER_INPUT_MSG);
        return TypeConverter.toList(Console.readLine());
    }
}
