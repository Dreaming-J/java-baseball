package baseball;

public class ValidationUtils {

    public static final int LOWER_NUMBER_INCLUSIVE = 1;
    public static final int UPPER_NUMBER_INCLUSIVE = 9;

    public static boolean validNo(int no) {
        return no >= LOWER_NUMBER_INCLUSIVE && no <= UPPER_NUMBER_INCLUSIVE;
    }
}
