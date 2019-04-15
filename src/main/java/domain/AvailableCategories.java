package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class AvailableCategories {
    @Builder.Default
    @Getter
    @Setter
    private boolean chance = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean yatzy = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean ones = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean twos = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean threes = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean fours = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean fives = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean sixes = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean pairs = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean twoPairs = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean threeOfAKind = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean fourOfAKind = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean smallStraight = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean largeStraight = true;
    @Builder.Default
    @Getter
    @Setter
    private boolean fullHouse = true;
}
