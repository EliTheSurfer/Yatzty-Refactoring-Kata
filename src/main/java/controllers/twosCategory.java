package controllers;

import domain.GivenRoll;

public class twosCategory {
    static final int REVERSE_PROBABILITY_FOR_A_SINGLE_VALUE = 6;

    public static double getQuantumScore(GivenRoll roll){
        int occurrences = helpers.getNumberOfRepetition(2,roll);
        double reverse_probability = Math.pow(REVERSE_PROBABILITY_FOR_A_SINGLE_VALUE, occurrences) ;

        return (reverse_probability)
                *
                Yatzy.twos(
                        roll.getFirstDice(),
                        roll.getSecondDice(),
                        roll.getThirdDice(),
                        roll.getFourthDice(),
                        roll.getFifthDice()
                );
    }
}
