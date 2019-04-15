package controllers;

import domain.GivenRoll;

public class fourOfAKindCategory {
    static final int REVERSE_PROBABILITY = 1296;

    public static double getQuantumScore(GivenRoll roll){

        return (REVERSE_PROBABILITY)
                *
                Yatzy.four_of_a_kind(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }
}
