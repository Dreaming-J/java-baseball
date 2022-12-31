package baseball.model;

import java.util.List;
import java.util.stream.Collectors;

public class Balls {

    private final List<Ball> answers;

    public Balls(List<Integer> answers) {
        this.answers = answers.stream()
                .map(answer -> new Ball(answers.indexOf(answer) + 1, answer))
                .collect(Collectors.toList());
    }

    public BallStatus play(Ball userBall) {
        return answers.stream()
                .map(answer -> answer.play(userBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
