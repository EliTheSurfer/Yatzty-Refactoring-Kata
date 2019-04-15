package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class threesCategoryTest {

    @Test
    public void getQuantumScore_should_return_the_right_value() {
        GivenRoll roll = GivenRoll.builder()
                .firstDice(3)
                .secondDice(3)
                .thirdDice(3)
                .fourthDice(2).fifthDice(5)
                .build();
        assertEquals(1944,  threesCategory.getQuantumScore(roll), 0.001);
    }
}