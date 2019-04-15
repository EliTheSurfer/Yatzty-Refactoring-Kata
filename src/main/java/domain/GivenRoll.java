package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder

public class GivenRoll {
    @Getter
    @Setter
    private int firstDice;
    @Getter
    @Setter
    private int secondDice;
    @Getter
    @Setter
    private int thirdDice;
    @Getter
    @Setter
    private int fourthDice;
    @Getter
    @Setter
    private int fifthDice;

    public Integer[] toArray(){
        Integer[] dicesScoreArray =  {firstDice, secondDice, thirdDice, fourthDice, fifthDice};
        return dicesScoreArray;
    }

    @Override
    public String toString() {
        return firstDice +","
            + secondDice +","
            + thirdDice +","
            + fourthDice +","
            + fifthDice;
    }
}
