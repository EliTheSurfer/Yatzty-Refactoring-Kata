package useCases;

import domain.AvailableCategories;
import domain.GivenRoll;
import org.junit.Test;

/*
 * This is the main test where you can try different rolls
 */
public class predictTheBestCategoryForAGivenRollTest {

    @Test
    public void Prediction_of_the_best_category_for_a_given_roll_with_All_the_Categories() {
        GivenRoll roll = GivenRoll.builder()
                                    .firstDice(1)
                                    .secondDice(1)
                                    .thirdDice(1)
                                    .thirdDice(3)
                                    .fourthDice(1)
                                    .fifthDice(1)
                                    .build();
        AvailableCategories categories = AvailableCategories.builder().build();

        predictTheBestCategoryForAGivenRoll.handle(roll, categories);
    }

    @Test
    public void Prediction_of_the_best_category_for_a_given_roll_with_just_some_categories_left() {
        //Given
        GivenRoll roll = GivenRoll.builder()
                .firstDice(1)
                .secondDice(1)
                .thirdDice(1)
                .thirdDice(3)
                .fourthDice(1)
                .fifthDice(1)
                .build();

        // This means that we can't score in the category four of A kind
        AvailableCategories categoriesLeft = AvailableCategories.builder()
                                                                .fourOfAKind(false)
                                                                .build();

        //Then
        predictTheBestCategoryForAGivenRoll.handle(roll, categoriesLeft);
    }
}