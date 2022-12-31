package baseball.model;

import java.util.List;
import java.util.stream.Collectors;

public class Balls {

    private final List<Ball> answers;

    public Balls(List<Integer> answers) {
        this.answers = answers.stream()
                .map(answer -> new Ball(answers.indexOf(answer), answer))
                .collect(Collectors.toList());
    }

    public PlayResult play(List<Integer> balls) {
        Balls userBalls = new Balls(balls);
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
