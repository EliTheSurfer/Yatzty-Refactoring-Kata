package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class largeStraightCategoryTest {

    @Test
    public void getQuantumScore_should_return_the_right_value() {
        GivenRoll roll = GivenRoll.builder()
                .firstDice(2)
                .secondDice(3)
                .thirdDice(4)
                .fourthDice(5)
                .fifthDice(6)
                .build();
        assertEquals(155520,  largeStraightCategory.getQuantumScore(roll), 0.001);
    }
}