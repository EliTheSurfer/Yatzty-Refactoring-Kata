package controllers;

import domain.GivenRoll;

public class threesCategory {
    private static final int REVERSE_PROBABILITY_FOR_A_SINGLE_VALUE = 6;

    public static double getQuantumScore(GivenRoll roll){
        final int occurrences = helpers.getNumberOfRepetition(3,roll);
        final double reverse_probability = Math.pow(REVERSE_PROBABILITY_FOR_A_SINGLE_VALUE, occurrences) ;

        return (reverse_probability)
                *
                Yatzy.threes(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }
}
