package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class onesCategoryTest {

    @Test
    public void getQuantumScore_should_return_the_right_value() {
        GivenRoll roll = GivenRoll.builder()
                                    .firstDice(1)
                                    .secondDice(1)
                                    .thirdDice(3).fourthDice(2).fifthDice(5)
                                    .build();
        assertEquals(72,  onesCategory.getQuantumScore(roll), 0.001);
    }
}