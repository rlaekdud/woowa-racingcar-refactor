package racingcar.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    void generate() {
        // given

        // when
        int randomNum = RandomNumberGenerator.generate();

        // then
        assertTrue(randomNum >= 0 && randomNum <= 9, "randomNum is not between 0 and 9");
    }
}