package baseball;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertUtil {

    public static List<Integer> convertIntToList(int number) {
        return Stream.of(String.valueOf(number).split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
