package controllers;

import domain.AvailableCategories;
import domain.GivenRoll;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class helpers {
    public static int getNumberOfRepetition(int monitoredValue, GivenRoll roll){
         return Collections.frequency(Arrays.asList(roll.toArray()), monitoredValue);
    }

    public static Map<Double, String> getQuantumScoreBoard(GivenRoll roll, AvailableCategories categories){
        return new HashMap<Double, String>() {{
            if(categories.isChance()){put((double) chanceCategory.getQuantumScore((roll)), "chance");}
            if(categories.isYatzy()){put((double) yatzyCategory.getQuantumScore(roll), "yatzy");}
            if(categories.isOnes()){put(onesCategory.getQuantumScore(roll), "ones");}
            if(categories.isTwos()){put(twosCategory.getQuantumScore(roll), "twos");}
            if(categories.isThrees()){put(threesCategory.getQuantumScore(roll), "threes");}
            if(categories.isFours()){put(foursCategory.getQuantumScore(roll), "fours");}
            if(categories.isFives()){put(fivesCategory.getQuantumScore(roll), "fives");}
            if(categories.isSixes()){put(sixesCategory.getQuantumScore(roll), "sixes");}
            if(categories.isPairs()){put(pairCategory.getQuantumScore(roll), "pair");}
            if(categories.isTwoPairs()){put(twoPairsCategory.getQuantumScore(roll), "twoPairs");}
            if(categories.isThreeOfAKind()){put(threeOfAKindCategory.getQuantumScore(roll), "three Of A Kind");}
            if(categories.isFourOfAKind()){put(fourOfAKindCategory.getQuantumScore(roll), "four Of A Kind");}
            if(categories.isSmallStraight()){put(smallStraightCategory.getQuantumScore(roll), "small Straight");}
            if(categories.isLargeStraight()){put(largeStraightCategory.getQuantumScore(roll), "large Straight"); }
            if(categories.isFullHouse()){put(fullHouseCategory.getQuantumScore(roll), "full house");}
        }};
    }

    public static Double getTheMaximumQuantumScoreFromARoll(GivenRoll roll){
        return Stream.of(
                    (double) chanceCategory.getQuantumScore(roll),
                    (double) yatzyCategory.getQuantumScore(roll),
                    onesCategory.getQuantumScore(roll),
                    twosCategory.getQuantumScore(roll),
                    threesCategory.getQuantumScore(roll),
                    foursCategory.getQuantumScore(roll),
                    fivesCategory.getQuantumScore(roll),
                    sixesCategory.getQuantumScore(roll),
                    pairCategory.getQuantumScore(roll),
                    twoPairsCategory.getQuantumScore(roll),
                    threeOfAKindCategory.getQuantumScore(roll),
                    fourOfAKindCategory.getQuantumScore(roll),
                    smallStraightCategory.getQuantumScore(roll),
                    largeStraightCategory.getQuantumScore(roll),
                    fullHouseCategory.getQuantumScore(roll))
                .max(Double::compare)
                .get();
    }
}
