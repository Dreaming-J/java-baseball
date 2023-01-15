package baseball.model;

import java.util.Objects;

public class BallNumber {

    public static final String WRONG_NO_RANGE = "볼 숫자는 1에서 9사이의 숫자여야 합니다.";
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;

    private final int no;

    public BallNumber(int no) {
        if (no < MIN_NO || no > MAX_NO) {
            throw new IllegalArgumentException(WRONG_NO_RANGE);
        }

        this.no = no;
    }

    public int get() {
        return this.no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallNumber that = (BallNumber) o;
        return no == that.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}
