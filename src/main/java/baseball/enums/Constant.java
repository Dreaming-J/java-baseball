package baseball.enums;

public enum Constant {
    GAME_NUMBER_SIZE(3);

    private int value;

    Constant(int value) {
        this.value = value;
    }

    public int get() {
        return this.value;
    }
}
