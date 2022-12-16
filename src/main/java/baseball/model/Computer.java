package baseball.model;

import baseball.module.NotModule;

import java.util.List;
import java.util.Objects;

public class Computer extends NotModule {

    private List<Integer> computerNumber;

    public Computer(List<Integer> computerNumber) {
        this.computerNumber = computerNumber;
    }

    public int calBall(List<Integer> userNumber) {
        int ball = 0;
        for (int number : userNumber) {
            if (isBall(number, userNumber.indexOf(number))) {
                ball++;
            }
        }

        return ball;
    }

    public int calStrike(List<Integer> userNumber) {
        int strike = 0;
        for (int number : userNumber) {
            if (isStrike(number, userNumber.indexOf(number))) {
                strike++;
            }
        }

        return strike;
    }

    public boolean isBall(int number, int index) {
        return computerNumber.contains(number) && not(Objects.equals(computerNumber.indexOf(number), index));
    }

    public boolean isStrike(int number, int index) {
        return Objects.equals(computerNumber.indexOf(number), index);
    }

    public boolean isContinue(List<Integer> userNumber) {
        return not(Objects.equals(computerNumber, userNumber));
    }
}
