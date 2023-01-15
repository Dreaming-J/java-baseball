package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.model.BallNumber.MAX_NO;
import static baseball.model.BallNumber.MIN_NO;
import static baseball.model.Balls.BALLS_SIZE;

public class RandomGenerator {

    public static List<Integer> createRandomBalls() {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < BALLS_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NO, MAX_NO);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        return computer;
    }
}
