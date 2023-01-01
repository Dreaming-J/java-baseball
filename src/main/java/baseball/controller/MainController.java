package baseball.controller;

import baseball.model.Balls;
import baseball.model.PlayResult;
import baseball.util.RandomGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class MainController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private Balls computer;
    private PlayResult result;

    private void init() {
        outputView.printGameStart();
        computer = new Balls(RandomGenerator.createRandomBalls());
        result = new PlayResult();
    }

    public void start() {
        init();

        while (result.isContinue()) {
            List<Integer> inputBalls = inputView.readBallNumber();
            result = computer.play(inputBalls);
        }
    }
}
