package baseball.controller;

import baseball.RandomNumberGenerator;
import baseball.controller.InputController;
import baseball.model.Computer;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.enums.Constant;

import java.util.List;

public class GameController {

    private static final String RETRY = "1";

    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final InputController inputController = new InputController();
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    private Computer computer;


    public void gameInit() {
        outputView.printStart();

        gameStart();
    }

    private void gameStart() {
        this.computer = new Computer(randomNumberGenerator.createRandomNumber(Constant.GAME_NUMBER_SIZE.get()));

        while (computer.isInGame()) {
            List<Integer> userNumber = inputController.inputUserNumber();
            computer.setUserNumber(userNumber);

            outputView.printResult(computer.calBall(), computer.calStrike());
        }

        gameEnd();
    }

    private void gameEnd() {
        outputView.printEnd();

        String retry = inputController.inputRetry();
        if (retry.equals(RETRY)) {
            gameStart();
        }
    }
}
