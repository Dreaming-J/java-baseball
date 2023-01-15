package baseball.view;

import baseball.model.PlayResult;

public class OutputView {

    private static final String GAME_START_MSG = "숫자 야구 게임을 시작합니다.";
    private static final String NOTHING = "낫싱";
    private static final String BALL = "볼 ";
    private static final String STRIKE = "스트라이크";
    private static final String GAME_END_MSG = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public void printGameStart() {
        System.out.println(GAME_START_MSG);
    }

    public void printPlayResult(PlayResult result) {
        if (result.isNothing()) {
            System.out.print(NOTHING);
        }
        if (result.hasBall()) {
            System.out.print(result.getBall() + BALL);
        }
        if (result.hasStrike()) {
            System.out.print(result.getStrike() + STRIKE);
        }
        System.out.println();
    }

    public void printGameEnd() {
        System.out.println(GAME_END_MSG);
    }

    public static void printError(String message) {
        System.out.println("[ERROR] " + message);
    }
}
