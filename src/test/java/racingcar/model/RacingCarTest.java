package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    private RacingCar racingCar = new RacingCar("test");

    @Test
    void advance() {
        // given

        // when
        racingCar.advance();

        //then
        assertEquals(racingCar.getDistance(), 1);
    }
}