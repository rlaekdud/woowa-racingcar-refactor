package racingcar.controller;

import java.util.List;
import java.util.Scanner;

public class InputController {

    private static final Scanner scanner = new Scanner(System.in);
    public static List<String> inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = scanner.nextLine();

        return List.of(carNames.split(","));
    }

    public static Integer inputRound() {
        System.out.println("시도할 회수는 몇회인가요?");

        return scanner.nextInt();
    }
}
