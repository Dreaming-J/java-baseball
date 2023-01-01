package baseball.model;

import static baseball.model.Balls.BALLS_SIZE;

public class PlayResult {

    private int ball = 0;
    private int strike = 0;

    public int getBall() {
        return this.ball;
    }

    public int getStrike() {
        return this.strike;
    }

    public void report(BallStatus status) {
        if (status.isBall()) {
            this.ball++;
        }
        if (status.isStrike()) {
            this.strike++;
        }
    }

    public boolean isContinue() {
        return this.strike != BALLS_SIZE;
    }
}
