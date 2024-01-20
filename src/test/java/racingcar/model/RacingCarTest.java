package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    private RacingCar racingCar = new RacingCar("test");

    @Test
    @DisplayName("RacingCar 객체 전진 method 테스트")
    void advance() {
        // given

        // when
        racingCar.advance();

        //then
        assertEquals(racingCar.getDistance(), 1);
    }
}