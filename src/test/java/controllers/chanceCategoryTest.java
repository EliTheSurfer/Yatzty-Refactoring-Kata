package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class chanceCategoryTest {

    @Test
    public void we_should_get_the_right_quantum_score_for_any_valid_roll() {
        //Given
        GivenRoll roll = GivenRoll.builder()
                                    .firstDice(1)
                                    .secondDice(2)
                                    .thirdDice(3)
                                    .fourthDice(4)
                                    .fifthDice(5)
                                    .build();
        //Then
        assertEquals(15, chanceCategory.getQuantumScore(roll));
    }
}