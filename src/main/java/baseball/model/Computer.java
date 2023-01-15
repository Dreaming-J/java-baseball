package baseball.model;

import java.util.List;
import java.util.Map;

public class Computer {

    private final List<Integer> computerNumber;
    private List<Integer> userNumber;

    public Computer(List<Integer> number) {
        this.computerNumber = number;
    }

    public boolean isInGame() {
        return !this.computerNumber.equals(this.userNumber);
    }

    public void setUserNumber(List<Integer> userNumber) {
        this.userNumber = userNumber;
    }

    public int calBall() {
        int ball = 0;
        for (int number : this.userNumber) {
            if (isBall(number)) {
                ball++;
            }
        }

        return ball;
    }

    public int calStrike() {
        int strike = 0;
        for (int number : this.userNumber) {
            if (isStrike(number)) {
                strike++;
            }
        }

        return strike;
    }

    private boolean isBall(int number) {
        return computerNumber.contains(number) && !(computerNumber.indexOf(number) == userNumber.indexOf(number));
    }

    private boolean isStrike(int number) {
        return computerNumber.indexOf(number) == userNumber.indexOf(number);
    }
}
