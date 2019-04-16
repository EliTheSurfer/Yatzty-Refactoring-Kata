package controllers;

import domain.GivenRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class helpersTest {

    @Test
    public void getNumberOfRepetition_should_return_the_right_values() {
        //Given
        GivenRoll roll = GivenRoll.builder()
                                  .firstDice(1)
                                  .secondDice(1)
                                  .thirdDice(3)
                                  .fourthDice(4)
                                  .fifthDice(5)
                                  .build();

        //Then
        assertEquals(2, helpers.getNumberOfRepetition(1,  roll));
        assertEquals(1, helpers.getNumberOfRepetition(3,  roll));
        assertEquals(0, helpers.getNumberOfRepetition(6,  roll));
    }


    @Test
    public void getTheMaximumQuantumScoreFromARoll_should_return_the_right_value() {
        //Given
        GivenRoll roll = GivenRoll.builder()
                .firstDice(1)
                .secondDice(1)
                .thirdDice(1)
                .fourthDice(1)
                .fifthDice(1)
                .build();
        //Then
        assertEquals(64800, helpers.getTheMaximumQuantumScoreFromARoll(roll), 0.001);
    }
}