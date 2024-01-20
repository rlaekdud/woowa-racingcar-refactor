package racingcar.utils;

import java.util.Random;

public class RandomNumberGenerator {

    private static Random random = new Random(100);

    public static Integer generate() {
        return (random.nextInt(10)); // 0~9 random number generate
    }
}
