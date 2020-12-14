package subway.view;

import java.util.Scanner;
import java.util.regex.Pattern;
import subway.constant.BoundaryCheckPattern;

public class InputView {

    private InputView() {

    }

    /**
     * 데이터 입력 기본 포맷
     */
    public static String scanData(Scanner scanner) {

        return scanner.nextLine();
    }

    public static String scanMainMenu(Scanner scanner) {
        String choiceMainMenuOption;

        do { // 유효한 값이 올 때 까지 값을 입력받는다.
            OutputView.OptionChoicePrint();
            choiceMainMenuOption = scanner.nextLine();
        } while (!mainMenuValidCheck(choiceMainMenuOption));

        return choiceMainMenuOption;
    }

    private static boolean mainMenuValidCheck(String choiceMainMenuOption) {
        if (Pattern.matches(
            BoundaryCheckPattern.MAIN_MENU_OPTION_LIMIT.getRegexBoundaryCheckPattern(),
            choiceMainMenuOption)) {
            return true;
        }

        OutputView.NotSelectableError();
        return false;
    }

    public static String scanStationMenu(Scanner scanner) {
        String choiceStationMenuOption;

        do { // 유효한 값이 올 때 까지 값을 입력받는다.
            OutputView.OptionChoicePrint();
            choiceStationMenuOption = scanner.nextLine();
        } while (!stationMenuValidCheck(choiceStationMenuOption));

        return choiceStationMenuOption;
    }

    private static boolean stationMenuValidCheck(String choiceStationMenuOption) {
        if (Pattern.matches(
            BoundaryCheckPattern.STATION_MENU_OPTION_LIMIT.getRegexBoundaryCheckPattern(),
            choiceStationMenuOption)) {
            return true;
        }

        OutputView.NotSelectableError();
        return false;
    }

    public static String scanStationName(Scanner scanner) {
        String stationName;

        OutputView.stationAddGuidePrint();
        stationName = scanner.nextLine();

        return stationName;
    }
}
