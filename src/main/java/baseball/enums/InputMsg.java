package baseball.enums;

public enum InputMsg {
    INPUT_MSG_USER_NUMBER("숫자를 입력해주세요 : "),
    INPUT_MSG_RETRY("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String message;

    InputMsg(String message) {
        this.message = message;
    }

    public String get() {
        return this.message;
    }
}
