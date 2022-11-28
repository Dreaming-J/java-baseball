package baseball.view;

import static baseball.enums.OutputMsg.*;

public class OutputView {

    public void printStart() {
        System.out.println(OUTPUT_MSG_START_GAME.get());
    }

    public void printResult(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            System.out.print(OUTPUT_MSG_NOTHING.get());
        }
        if (ball > 0) {
            System.out.print(ball + OUTPUT_MSG_BALL.get() + " ");
        }
        if (strike > 0) {
            System.out.print(strike + OUTPUT_MSG_STRIKE.get());
        }
        System.out.println("");
    }

    public void printEnd() {
        System.out.println(OUTPUT_MSG_END_GAME.get());
    }
}
