package subway;

import java.util.Scanner;
import subway.constant.UserChoiceOptionToName;
import subway.view.InputView;
import subway.view.OutputView;

public class SubwayController {

    Scanner scanner;

    public SubwayController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mainMenu() {
        String mainMenuOptionChoice = new String();

        OutputView.mainMenuPrint();

        while (!mainMenuOptionChoice.
            equals(UserChoiceOptionToName.EXIT.getUserChoiceOptionToName())) {
            mainMenuOptionChoice = InputView.scanMainMenu(scanner);
            if (mainMenuOptionChoice
                .equals(UserChoiceOptionToName.STATION_MANAGEMENT.getUserChoiceOptionToName())) {
                StationController.stationControlMenu(scanner);
            }
        }
    }
}
