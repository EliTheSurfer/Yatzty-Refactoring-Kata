package controllers;

import domain.GivenRoll;

public class smallStraightCategory {
    private static final int REVERSE_PROBABILITY = 7776;

    public static double getQuantumScore(GivenRoll roll){
        return (REVERSE_PROBABILITY)
                *
                Yatzy.smallStraight(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }
}
