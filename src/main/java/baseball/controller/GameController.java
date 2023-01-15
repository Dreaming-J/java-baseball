package baseball.controller;

import baseball.enums.RetryOption;
import baseball.model.Computer;
import baseball.module.RepeatModule;
import baseball.utils.RandomGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;
import java.util.Objects;

public class GameController extends RepeatModule {

    private Computer computer;
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void init() {
        outputView.printGameStart();

        start();
    }

    public void start() {
        computer = new Computer(RandomGenerator.randomComputerNumber());
        List<Integer> userNumber;
        do {
            userNumber = repeat(inputView::readUserNumber);
            int ball = computer.calBall(userNumber);
            int strike = computer.calStrike(userNumber);
            outputView.printCompareResult(ball, strike);
        } while (computer.isContinue(userNumber));

        restart();
    }

    public void restart() {
        outputView.printGameOver();
        String retry = repeat(inputView::readRetry);

        if (Objects.equals(RetryOption.RETRY.get(), retry)) {
            start();
        }
    }
}
