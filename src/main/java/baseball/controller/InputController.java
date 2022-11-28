package baseball.controller;

import static baseball.ConvertUtil.convertIntToList;
import baseball.model.InputValidator;
import baseball.view.InputView;

import java.util.List;

public class InputController {

    private final InputValidator inputValidator = new InputValidator();
    private final InputView inputView = new InputView();

    public List<Integer> inputUserNumber() {
        String userNumber = inputView.readUserNumber();
        inputValidator.validateGameNumber(userNumber);

        return convertIntToList(Integer.parseInt(userNumber));
    }

    public String inputRetry() {
        String retry = inputView.readRestart();
        inputValidator.validateRetry(retry);

        return retry;
    }
}
