package controllers;

import domain.GivenRoll;

public class largeStraightCategory {
     private static final int REVERSE_PROBABILITY = 7776;

    public static double getQuantumScore(GivenRoll roll){

        return (REVERSE_PROBABILITY)
                *
                Yatzy.largeStraight(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }
}
