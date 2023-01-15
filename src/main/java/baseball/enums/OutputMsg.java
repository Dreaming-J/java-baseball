package baseball.enums;

public enum OutputMsg {
    OUTPUT_MSG_START_GAME("숫자 야구 게임을 시작합니다."),
    OUTPUT_MSG_NOTHING("낫싱"),
    OUTPUT_MSG_BALL("볼"),
    OUTPUT_MSG_STRIKE("스트라이크"),
    OUTPUT_MSG_END_GAME("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    private final String message;

    OutputMsg(String message) {
        this.message = message;
    }

    public String get() {
        return this.message;
    }
}
