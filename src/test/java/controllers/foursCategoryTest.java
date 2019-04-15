package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class foursCategoryTest {
    @Test
    public void getQuantumScore_should_return_the_right_value() {
        GivenRoll roll = GivenRoll.builder()
                .firstDice(4)
                .secondDice(4)
                .thirdDice(3).fourthDice(2).fifthDice(5)
                .build();
        assertEquals(288,  foursCategory.getQuantumScore(roll), 0.001);
    }
}