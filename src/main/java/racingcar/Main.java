package racingcar;

import racingcar.controller.GameController;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.play();
    }
}