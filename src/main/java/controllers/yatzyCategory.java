package controllers;

import domain.GivenRoll;

public class yatzyCategory {
    private final static int REVERSE_PROBABILITY = 1296;

    public static int getQuantumScore(GivenRoll roll){
        return (REVERSE_PROBABILITY)
                *
                Yatzy.yatzy(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                        );
    }

}
