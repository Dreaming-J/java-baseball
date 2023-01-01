package baseball.module;

import baseball.view.OutputView;

import java.util.function.Supplier;

public class RepeatModule {

    protected <T> T repeat(Supplier<T> inputReader) {
        try {
            return inputReader.get();
        } catch (IllegalArgumentException e) {
            OutputView.printError(e.getMessage());
            return repeat(inputReader);
        }
    }
}