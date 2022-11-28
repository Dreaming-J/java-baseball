package baseball.view;

import static baseball.enums.InputMsg.*;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readUserNumber() {
        System.out.print(INPUT_MSG_USER_NUMBER.get());
        return Console.readLine();
    }

    public String readRestart() {
        System.out.println(INPUT_MSG_RETRY.get());
        return Console.readLine();
    }
}
