package controllers;

import domain.GivenRoll;

public class pairCategory {
    static final int REVERSE_PROBABILITY = 6;

    public static double getQuantumScore(GivenRoll roll){

        return (REVERSE_PROBABILITY)
                *
                Yatzy.score_pair(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }
}
