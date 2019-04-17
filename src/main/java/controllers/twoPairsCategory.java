package controllers;

import domain.GivenRoll;

public class twoPairsCategory {
    private static final int REVERSE_PROBABILITY = 36;

    public static double getQuantumScore(GivenRoll roll){
        return (REVERSE_PROBABILITY)
                *
                Yatzy.two_pair(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }
}
