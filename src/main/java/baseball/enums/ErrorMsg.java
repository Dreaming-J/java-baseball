package baseball.enums;

public enum ErrorMsg {
    ERROR_PREFIX("[ERROR] "),
    ERROR_MSG_INPUT_IS_NOT_NUMBER("숫자 이외의 입력은 할 수 없습니다."),
    ERROR_MSG_GAME_NUMBER_IS_NOT_THREE_DIGITS("3자리 외의 숫자는 입력할 수 없습니다."),
    ERROR_MSG_GAME_NUMBER_IS_NOT_DUPLICATATE("중복된 숫자는 입력할 수 없습니다."),
    ERROR_MSG_RETRY_IS_ONLY_1_OR_2("1 혹은 2 외의 숫자는 입력할 수 없습니다.");

    private final String message;

    ErrorMsg(String message) {
        this.message = message;
    }

    public String get() {
        return this.message;
    }
}
