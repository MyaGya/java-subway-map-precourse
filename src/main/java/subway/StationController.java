package subway;

import java.util.Scanner;
import java.util.stream.Collectors;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.InputView;
import subway.view.OutputView;
import subway.constant.UserChoiceOptionToName;

public class StationController {

    private StationController() {

    }

    public static void stationControlMenu(Scanner scanner) {
        String choiceMenu;
        boolean workStatus = false;

        while (isWorkSuccess(workStatus)) {
            OutputView.stationMenuPrint();
            choiceMenu = InputView.scanStationMenu(scanner);

            if (choiceMenu.
                equals(UserChoiceOptionToName.STATION_ADD.getUserChoiceOptionToName())) {
                workStatus = stationAdd(scanner);
            }
            if (choiceMenu.
                equals(UserChoiceOptionToName.STATION_DELETE.getUserChoiceOptionToName())) {
                workStatus = stationDelete(scanner);
            }
            if (choiceMenu.
                equals(UserChoiceOptionToName.STATION_CHECK.getUserChoiceOptionToName())) {
                workStatus = stationCheck();
            }
            if (choiceMenu.equals(UserChoiceOptionToName.BACK.getUserChoiceOptionToName())) {
                break;
            }
        }
    }

    private static boolean isWorkSuccess(boolean workStatus) {
        return !workStatus;
    }

    private static boolean stationAdd(Scanner scanner) {
        String stationName;
        try {
            stationName = InputView.scanStationName(scanner);
        } catch (IllegalArgumentException error) {
            return false;
        }

        Station newStation = new Station(stationName);
        StationRepository.addStation(newStation);
        return true;
    }

    private static boolean stationDelete(Scanner scanner) {
        return true;
    }

    private static boolean stationCheck() {
        return true;
    }


}
