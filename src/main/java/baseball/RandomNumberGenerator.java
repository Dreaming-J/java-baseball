package baseball;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {

    private static final int NUMBER_LOWER_INCLUSIVE = 1;
    private static final int NUMBER_UPPER_INCLUSIVE = 9;

    public List<Integer> createRandomNumber(int size) {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < size) {
            int randomNumber = Randoms.pickNumberInRange(NUMBER_LOWER_INCLUSIVE, NUMBER_UPPER_INCLUSIVE);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        return computer;
    }
}
