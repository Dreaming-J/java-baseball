package baseball.controller;

import baseball.model.Balls;
import baseball.model.PlayResult;
import baseball.model.RetryOption;
import baseball.module.RepeatModule;
import baseball.util.RandomGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class MainController extends RepeatModule {

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
            Balls inputBalls = repeat(inputView::readBallNumber);
            result = computer.play(inputBalls);

            outputView.printPlayResult(result);
        }

        end();
    }

    private void end() {
        outputView.printGameEnd();

        RetryOption option = repeat(inputView::readRetryCommand);

        if (option.isRetry()) {
            start();
        }
    }
}
