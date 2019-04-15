package controllers;

import domain.GivenRoll;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class yatzyCategoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void We_should_get_the_right_Quantum_score_for_a_valid_yatzy_roll() {
        //Given
        GivenRoll testRoll =
                GivenRoll.builder()
                .firstDice(1)
                .secondDice(1)
                .thirdDice(1)
                .fourthDice(1)
                .fifthDice(1)
                .build();
        //Then
        Assert.assertEquals( 64800, yatzyCategory.getQuantumScore(testRoll));
    }

    @Test
    public void the_Quantum_score_should_be_zero_for_an_invalid_yatzy_roll() {
        //Given
        GivenRoll testRoll =
                GivenRoll.builder()
                        .firstDice(2)
                        .secondDice(1)
                        .thirdDice(1)
                        .fourthDice(1)
                        .fifthDice(1)
                        .build();
        //Then
        Assert.assertEquals( 0, yatzyCategory.getQuantumScore(testRoll));
    }
}