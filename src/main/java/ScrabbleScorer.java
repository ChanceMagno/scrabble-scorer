import java.util.Arrays;

public class ScrabbleScorer {
  public Integer calculateSingleLetterScore(String letterToScore) {
    Integer score = 0;
    String[] onePointArray = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    String[] twoPointArray = {"d", "g"};
    if (Arrays.asList(onePointArray).contains(letterToScore)) {
      score = 1;
    } else if (Arrays.asList(twoPointArray).contains(letterToScore)) {
      score = 2;
    }
    return score;
  }


}
