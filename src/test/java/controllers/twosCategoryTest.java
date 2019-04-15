package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class twosCategoryTest {

    @Test
    public void getQuantumScore_should_return_the_right_value() {
        GivenRoll roll = GivenRoll.builder()
                .firstDice(2)
                .secondDice(2)
                .thirdDice(3).fourthDice(4).fifthDice(5)
                .build();
        assertEquals(144,  twosCategory.getQuantumScore(roll), 0.001);
    }
}