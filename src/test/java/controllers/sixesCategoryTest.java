package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class sixesCategoryTest {

    @Test
    public void getQuantumScore_should_return_the_right_value() {
        GivenRoll roll = GivenRoll.builder()
                .firstDice(6)
                .secondDice(6)
                .thirdDice(3).fourthDice(2).fifthDice(5)
                .build();
        assertEquals(432,  sixesCategory.getQuantumScore(roll), 0.001);
    }
}