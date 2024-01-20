package racingcar.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputControllerTest {

    private final InputStream systemIn = System.in;

    @Test
    void inputCarName() {
        String inputData = "car1,car2,car3\n";
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        List<String> expected = Arrays.asList("car1", "car2", "car3");
        List<String> actual = InputController.inputCarName();

        assertEquals(expected, actual);

        // 테스트 종료 후 원래의 System.in을 복구
        System.setIn(systemIn);
    }

    @Test
    void inputRound() {
        String inputData = "5\n";
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        int expected = 5;
        int actual = InputController.inputRound();

        assertEquals(expected, actual);

        // 테스트 종료 후 원래의 System.in을 복구
        System.setIn(systemIn);
    }
}