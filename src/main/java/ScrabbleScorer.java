import java.util.Arrays;

public class ScrabbleScorer {
  public Integer calculateSingleLetterScore(String letterToScore) {
    Integer score = 0;
    String[] onePointArray = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    String[] twoPointArray = {"d", "g"};
    String[] threePointArray = {"b", "c", "m", "p"};
    String[] fourPointArray = {"f", "h", "v", "w", "y"};
    if (Arrays.asList(onePointArray).contains(letterToScore)) {
      score = 1;
    } else if (Arrays.asList(twoPointArray).contains(letterToScore)) {
      score = 2;
    } else if (Arrays.asList(threePointArray).contains(letterToScore)) {
      score = 3;
    } else if (Arrays.asList(fourPointArray).contains(letterToScore)) {
      score = 4;
    }
    return score;
  }


}
