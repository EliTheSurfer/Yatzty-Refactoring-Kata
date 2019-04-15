package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class threeOfAKindCategoryTest {

    @Test
    public void getQuantumScore_should_return_the_right_value() {
        GivenRoll roll = GivenRoll.builder()
                .firstDice(1).secondDice(1).thirdDice(1)
                .fourthDice(2).fifthDice(2)
                .build();
        assertEquals(648,  threeOfAKindCategory.getQuantumScore(roll), 0.001);
    }
}