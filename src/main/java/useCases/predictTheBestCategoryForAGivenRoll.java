package useCases;

import controllers.helpers;
import domain.AvailableCategories;
import domain.GivenRoll;

import java.util.Map;

public class predictTheBestCategoryForAGivenRoll {
    static void handle(GivenRoll roll, AvailableCategories categories){
        Map<Double, String> scoreBoard =  helpers.getQuantumScoreBoard(roll,categories );
        Double maximumQuantumScore = helpers.getTheMaximumQuantumScoreFromARoll(roll);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Considering the remaining categories available, the best category for this roll ["+ roll.toString()
                + "] is : "+ scoreBoard.get(maximumQuantumScore));
        System.out.println("-----------------------------------------------------------------------------------------");

    }
}
