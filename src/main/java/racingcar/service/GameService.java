package racingcar.service;

import racingcar.model.RacingCar;
import racingcar.utils.RandomNumberGenerator;

import java.util.List;

public class GameService {

    private List<RacingCar> racingCarList;

    public GameService(List<RacingCar> racingCarList) {
        this.racingCarList = racingCarList;
    }

    public void playOneRound() { // 한 라운드를 진행, 출력은 하지 않음(출력은 controller에서!)

        for(RacingCar racingCar : racingCarList) {
            if(isAdvance()) racingCar.advance();
        }
    }

    private boolean isAdvance() {
        int randomNumber = RandomNumberGenerator.generate();

        return randomNumber >= 4;
    }
}
