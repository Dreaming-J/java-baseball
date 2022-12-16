package baseball.view;

public class OutputView {

    private static final String ERROR_PREFIX = "[ERROR] ";
    private static final String MSG_GAME_START = "숫자 야구 게임을 시작합니다.";
    private static final String NOTHING = "낫싱";
    private static final String BALL = "볼 ";
    private static final String STRIKE = "스트라이크";
    private static final String MSG_GAME_OVER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final int ZERO = 0;

    public void printErrorMsg(String message) {
        System.out.println(ERROR_PREFIX + message);
    }

    public void printGameStart() {
        System.out.println(MSG_GAME_START);
    }

    public void printCompareResult(int ball, int strike) {
        if (ball == ZERO && strike == ZERO) {
            System.out.print(NOTHING);
        }
        if (ball != ZERO) {
            System.out.print(ball + BALL);
        }
        if (strike != ZERO) {
            System.out.print(strike + STRIKE);
        }
        System.out.println();
    }

    public void printGameOver() {
        System.out.println(MSG_GAME_OVER);
    }
}
