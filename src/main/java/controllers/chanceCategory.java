package controllers;

import domain.GivenRoll;

public class chanceCategory {
    private final static int REVERSE_PROBABILITY = 1;

    public static int getQuantumScore(GivenRoll roll){
        return (REVERSE_PROBABILITY)
                *
                Yatzy.chance(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }

}
