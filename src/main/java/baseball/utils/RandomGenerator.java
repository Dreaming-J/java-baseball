package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {

    private static final int NUMBER_SIZE = 3;
    private static final int LOWER_NUMBER_INCLUSIVE = 1;
    private static final int UPPER_NUMBER_INCLUSIVE = 9;

    public static List<Integer> randomComputerNumber() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(LOWER_NUMBER_INCLUSIVE, UPPER_NUMBER_INCLUSIVE);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
