package baseball.controller;

import baseball.model.Balls;
import baseball.util.RandomGenerator;
import baseball.view.OutputView;

public class MainController {

    private final OutputView outputView = new OutputView();
    private Balls computer;

    private void init() {
        outputView.printGameStart();
        computer = new Balls(RandomGenerator.createRandomBalls());
    }

    public void start() {
        init();
    }
}
