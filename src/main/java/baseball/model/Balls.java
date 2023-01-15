package baseball.model;

import java.util.List;
import java.util.stream.Collectors;

public class Balls {

    private static final String WRONG_BALLS_NUMBER_TYPE = "볼 숫자는 서로 다른 3자리 숫자여야 합니다.";
    public static final int BALLS_SIZE = 3;
    private final List<Ball> answers;

    public Balls(List<Integer> answers) {
        validate(answers);
        this.answers = answers.stream()
                .map(answer -> new Ball(answers.indexOf(answer), answer))
                .collect(Collectors.toList());
    }

    private void validate(List<Integer> answers) {
        if (answers.stream().distinct().count() != BALLS_SIZE) {
            throw new IllegalArgumentException(WRONG_BALLS_NUMBER_TYPE);
        }
    }

    public PlayResult play(Balls userBalls) {
        PlayResult result = new PlayResult();

        for (Ball answer : answers) {
            BallStatus status = userBalls.play(answer);
            result.report(status);
        }

        return result;
    }

    public BallStatus play(Ball userBall) {
        return answers.stream()
                .map(answer -> answer.play(userBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
