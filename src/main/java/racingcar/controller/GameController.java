package racingcar.controller;

import racingcar.service.GameService;
import racingcar.view.GameView;

public class GameController {

    private GameService gameService;
    public GameController() {
    }

    public void play() {
        gameService = new GameService(InputController.inputCarName());
        Integer roundNum = InputController.inputRound();

        GameView.printGameResultString();
        for(int i = 0; i < roundNum; i++) {
            gameService.playOneRound();
            GameView.printRacingCarStatus(gameService.getRacingCarList());
        }

        GameView.printWinner(gameService.determineWinner());
    }
}
