package racingcar.service;

import racingcar.model.RacingCar;
import racingcar.utils.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameService {

    private List<RacingCar> racingCarList;

    public GameService(List<String> racingCarNameList) { // 처음 생성 시 init
        this.racingCarList = new ArrayList<>();

        for(String racingCarName : racingCarNameList) {
            racingCarList.add(new RacingCar(racingCarName));
        }
    }

    public void playOneRound() { // 한 라운드를 진행, 출력은 하지 않음(출력은 controller에서!)

        for(RacingCar racingCar : racingCarList) {
            if(isAdvance()) racingCar.advance();
        }
    }

    public List<RacingCar> determineWinner() {
        int maxDistance = racingCarList.stream()
                .mapToInt(RacingCar::getDistance)
                .max()
                .orElseThrow(IllegalArgumentException::new);

        return racingCarList.stream()
                .filter(car -> car.getDistance() == maxDistance)
                .collect(Collectors.toList());
    }

    private boolean isAdvance() {
        int randomNumber = RandomNumberGenerator.generate();

        return randomNumber >= 4;
    }
}
