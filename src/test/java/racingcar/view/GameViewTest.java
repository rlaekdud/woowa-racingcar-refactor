package racingcar.view;

import org.junit.jupiter.api.Test;
import racingcar.model.RacingCar;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameViewTest {

    @Test
    void printRacingCarStatus() {
        // given
        List<RacingCar> racingCarList = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            RacingCar car = new RacingCar(String.valueOf(i));
            car.advance();
            racingCarList.add(car);
        }

        // 콘솔 출력을 캡처하기 위한 설정
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // when
        GameView.printRacingCarStatus(racingCarList);

        // then
        String expectedOutput  = "0 : -\n1 : -\n";
        assertEquals(expectedOutput, outContent.toString());

    }

    @Test
    void printWinner() {
        // given
        List<RacingCar> racingCarList = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            RacingCar car = new RacingCar(String.valueOf(i));
            car.advance();
            racingCarList.add(car);
        }

        // 콘솔 출력을 캡처하기 위한 설정
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // when
        GameView.printWinner(racingCarList);

        // then
        String expectedOutput  = "\n최종 우승자 : 0, 1\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}