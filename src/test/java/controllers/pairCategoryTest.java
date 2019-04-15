package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class pairCategoryTest {

    @Test
    public void getQuantumScore_should_return_the_right_value() {
        GivenRoll roll = GivenRoll.builder()
                .firstDice(1)
                .secondDice(1)
                .thirdDice(3).fourthDice(2).fifthDice(5)
                .build();
        assertEquals(12,  pairCategory.getQuantumScore(roll), 0.001);
    }

    @Test
    public void getQuantumScore_should_return_the_right_value_with_two_same_pairs() {
        GivenRoll roll = GivenRoll.builder()
                .firstDice(1).secondDice(1)
                .thirdDice(1).fourthDice(1)
                .fifthDice(5)
                .build();
        assertEquals(12,  pairCategory.getQuantumScore(roll), 0.001);
    }
}