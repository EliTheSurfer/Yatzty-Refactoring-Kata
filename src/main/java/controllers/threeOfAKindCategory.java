package controllers;

import domain.GivenRoll;

public class threeOfAKindCategory {
    private static final int REVERSE_PROBABILITY = 216;

    public static double getQuantumScore(GivenRoll roll){
        return (REVERSE_PROBABILITY)
                *
                Yatzy.three_of_a_kind(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }
}
