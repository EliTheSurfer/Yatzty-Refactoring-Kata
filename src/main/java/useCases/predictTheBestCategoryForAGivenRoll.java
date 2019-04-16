package useCases;

import controllers.helpers;
import domain.AvailableCategories;
import domain.GivenRoll;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class predictTheBestCategoryForAGivenRoll {
    static void handle(GivenRoll roll, AvailableCategories categories){
        TreeMap<Double, String> scoreBoard =  new TreeMap<>(helpers.getQuantumScoreBoard(roll,categories ));

        //Show the Quantum ScoreBoard
        scoreBoard
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(System.out::println);

        // Collecting the best category
        String bestCategory  = Collections.max(scoreBoard.entrySet(), Map.Entry.comparingByKey()).getValue();

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("Considering the remaining categories available, the best category for this roll [%s] is : %s.%n", roll.toString(), bestCategory);
        System.out.println("-----------------------------------------------------------------------------------------");

    }
}
