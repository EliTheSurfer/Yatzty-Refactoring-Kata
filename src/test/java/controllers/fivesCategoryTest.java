package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class fivesCategoryTest {

    @Test
    public void getQuantumScore_should_return_the_right_value() {
        GivenRoll roll = GivenRoll.builder()
                .firstDice(5)
                .secondDice(5)
                .thirdDice(3).fourthDice(2).fifthDice(1)
                .build();
        assertEquals(360,  fivesCategory.getQuantumScore(roll), 0.001);
    }
}