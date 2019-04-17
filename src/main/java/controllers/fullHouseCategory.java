package controllers;

import domain.GivenRoll;

public class fullHouseCategory {
    private static final int REVERSE_PROBABILITY = 216;

    public static double getQuantumScore(GivenRoll roll){

        return (REVERSE_PROBABILITY)
                *
                Yatzy.fullHouse(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }
}
