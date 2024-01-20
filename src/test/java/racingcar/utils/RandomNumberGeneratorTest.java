package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    @DisplayName("RandomNumberGenerator 정상 작동 테스트")
    void generate() {
        // given

        // when
        int randomNum = RandomNumberGenerator.generate();

        // then
        assertTrue(randomNum >= 0 && randomNum <= 9, "randomNum is not between 0 and 9");
    }
}