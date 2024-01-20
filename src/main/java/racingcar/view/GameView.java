package racingcar.view;

import racingcar.model.RacingCar;

import java.util.List;

public class GameView {

    public static void printGameResultString() {
        System.out.println("\n실행 결과");
    }
    public static void printRacingCarStatus(List<RacingCar> racingCarList) {
        for(RacingCar racingCar : racingCarList) {
            System.out.println(racingCar.getName() + " : " + getDistanceString(racingCar.getDistance()));
        }
    }

    public static void printWinner(List<RacingCar> winnerList) {
        System.out.print("\n최종우승자 : ");
        System.out.print(winnerList.get(0).getName());
        winnerList.remove(0);

        if(!winnerList.isEmpty()) {
            System.out.print(", " + winnerList.get(0).getName());
            winnerList.remove(0);
        }
        System.out.println();
    }

    private static String getDistanceString(Integer distance) {

        StringBuilder distanceString = new StringBuilder();
        for(int i = 0; i < distance; i++) {
            distanceString.append("-");
        }

        return distanceString.toString();
    }
}
